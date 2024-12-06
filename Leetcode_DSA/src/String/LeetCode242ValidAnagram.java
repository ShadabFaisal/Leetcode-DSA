package String;

import java.util.Arrays;

public class LeetCode242ValidAnagram {

	public static void main(String[] args) {
		String s="anagram";
		String t="nagaram";
		boolean ans=isAnagram(s,t);
		System.out.println(ans);
	}

	public static boolean isAnagram(String s, String t) {

		boolean isAnagram = true;

		if (s.length() != t.length()) {
			isAnagram = false;
		} else {
			char[] str1 = s.toCharArray();
			char[] t1 = t.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(t1);
			isAnagram = Arrays.equals(str1, t1);
		}
		return (isAnagram == true) ? true : false;

	}

}
/*
 * 242. Valid Anagram
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram" Output: true Example 2:
 * 
 * Input: s = "rat", t = "car" Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length, t.length <= 5 * 104 s and t consist of lowercase English
 * letters.
 */