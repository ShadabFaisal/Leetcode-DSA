package String;

import java.util.HashMap;

public class LeetCode2131LongestPalindromeByConcatenatingTwoLetterWord {

	public static void main(String[] args) {
		String[] words = { "lc", "cl", "gg" };
		System.out.println(longestPalindrome(words));
	}

	public static int longestPalindrome(String[] words) {
		HashMap<String, Integer> map = new HashMap<>();
		int max = 0;
		for (int i = 0; i < words.length; i++) {
			String rev = words[i].charAt(1) + "" + words[i].charAt(0);
			if (map.containsKey(rev)) {
				max += 4;
				map.put(rev, map.get(rev) - 1);
				if (map.get(rev) == 0)
					map.remove(rev);
				continue;
			}
			map.put(words[i], map.getOrDefault(words[i], 0) + 1);
		}
		for (String k : map.keySet()) {
			if (map.get(k) == 1 && (k.charAt(1) + "" + k.charAt(0)).equals(k)) {
				max += 2;
				break;
			}
		}
		return max;
	}

}
