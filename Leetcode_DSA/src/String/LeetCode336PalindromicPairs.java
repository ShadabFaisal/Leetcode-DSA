package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LeetCode336PalindromicPairs {

	public static void main(String[] args) {
		String[] words = { "abcd", "dcba", "lls", "s", "sssll" };
		List<List<Integer>> ans = palindromePairs(words);
		List<List<Integer>> res = palindromePairsOp(words);
		System.out.println(ans);
		System.out.println(res);
	}

	// Better Brute-Force Approach
	public static List<List<Integer>> palindromePairs(String[] words) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < words.length; ++i) {
			map.put(words[i], i);
		}
		// Empty String case
		if (map.containsKey("")) {
			int blankIdx = map.get("");
			for (int i = 0; i < words.length; ++i) {
				if (i != blankIdx && isPalindrome(words[i])) {
					res.add(Arrays.asList(blankIdx, i));
					res.add(Arrays.asList(i, blankIdx));
				}
			}
		}

		// Reflection case
		for (int i = 0; i < words.length; ++i) {
			String reversed = new StringBuilder(words[i]).reverse().toString();
			Integer reversedIdx = map.get(reversed);
			if (reversedIdx != null && reversedIdx != i) {
				res.add(Arrays.asList(i, reversedIdx));
			}
		}

		// Tricky case
		for (int i = 0; i < words.length; ++i) {
			String cur = words[i];
			for (int cut = 1; cut < cur.length(); ++cut) {
				String left = cur.substring(0, cut);
				String right = cur.substring(cut);
				if (isPalindrome(left)) {
					String reversedRight = new StringBuilder(right).reverse().toString();
					if (map.containsKey(reversedRight)) {
						res.add(Arrays.asList(map.get(reversedRight), i));
					}
				}
				if (isPalindrome(right)) {
					String reversedLeft = new StringBuilder(left).reverse().toString();
					if (map.containsKey(reversedLeft)) {
						res.add(Arrays.asList(i, map.get(reversedLeft)));
					}
				}
			}
		}
		return res;
	}

	private static boolean isPalindrome(String word) {
		int i = 0, j = word.length() - 1;
		while (i < j) {
			if (word.charAt(i++) != word.charAt(j--))
				return false;
		}
		return true;
	}

	// Optimised Approach
	public static List<List<Integer>> palindromePairsOp(String[] words) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < words.length; ++i) {
			map.put(words[i], i);
			set.add(words[i].length());
		}
		for (int i = 0; i < words.length; i++) {
			int length = words[i].length();
			if (length == 1) {
				if (map.containsKey("")) {
					res.add(Arrays.asList(map.get(""), i));
					res.add(Arrays.asList(i, map.get("")));
				}
				continue;
			}

			String reverse = new StringBuilder(words[i]).reverse().toString();
			if (map.containsKey(reverse) && map.get(reverse) != i) {
				res.add(Arrays.asList(i, map.get(reverse)));
			}
			for (Integer k : set) {
				if (k == length)
					break;
				if (isPalindrome(reverse, 0, length - 1 - k)) {
					String s1 = reverse.substring(length - k);
					if (map.containsKey(s1)) {
						res.add(Arrays.asList(i, map.get(s1)));
					}

				}
				if (isPalindrome(reverse, k, length - 1)) {
					String s2 = reverse.substring(0, k);
					if (map.containsKey(s2)) {
						res.add(Arrays.asList(map.get(s2), i));
					}

				}
			}

		}

		return res;
	}

	private static boolean isPalindrome(String word, int i, int j) {

		while (i < j) {
			if (word.charAt(i++) != word.charAt(j--))
				return false;
		}
		return true;
	}

}
