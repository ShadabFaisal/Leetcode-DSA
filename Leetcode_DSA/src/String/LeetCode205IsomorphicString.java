package String;

import java.util.HashMap;

public class LeetCode205IsomorphicString {

	public static void main(String[] args) {
		String s = "foo";
		String t = "bar";
		System.out.println(isIsomorphicOp(s, t));

	}

	public static boolean isIsomorphic(String s, String t) {

		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Boolean> map2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			if (map1.containsKey(ch1)) {
				if (map1.get(ch1) != ch2) {
					return false;
				}
			} else if (map2.containsKey(ch2)) {
				return false;
			} else {
				map1.put(ch1, ch2);
				map2.put(ch2, true);
			}

		}
		return true;

	}

	public static boolean isIsomorphicOp(String s, String t) {
		HashMap<Character, Character> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}
			} else if (map.containsValue(t.charAt(i))) {
				return false;
			}
			map.put(s.charAt(i), t.charAt(i));
		}
		return true;
	}

}
