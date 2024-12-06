package String;

public class LeetCode76MinimumWindowSubstring {

	public static void main(String[] args) {
		String s="ADOBECODEBANC";
		String t="ABC";
		System.out.println(minWindow(s,t));

	}

	public static String minWindow(String s, String t) {

		int[] freq = new int[128];
		for (char c : t.toCharArray()) {
			freq[c]++;
		}
		int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();

		while (end < s.length()) {
			char endS = s.charAt(end);
			if (freq[endS] > 0) {
				counter--;
			}
			freq[endS]--;
			end++;
			while (counter == 0) {
				if (minLen > end - start) {
					minLen = end - start;
					minStart = start;
				}
				System.out.println(s.substring(start, end));//to print all the substrings of s in which each character of t is present including duplicates.
				char startS = s.charAt(start);
				freq[startS]++;
				if (freq[startS] > 0)
					counter++;

				start++;
			}
		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
	}

}
