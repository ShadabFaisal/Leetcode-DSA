package String;

import java.util.ArrayList;
import java.util.List;

public class LeetCode58LengthOfLastWord {

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWordOp(s));
	}

	// 2ms
	public static int lengthOfLastWord(String s) {
		String str = s.trim();
		int len = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				len = 0;
			} else {
				len++;
			}
		}
		return len;
	}

	// 13ms
	public static int lengthOfLastWord1(String s) {
		List<String> list = new ArrayList<>();
		String word = "";
		String str = s.trim();
		for (char c : str.toCharArray()) {
			if (c == ' ') {
				list.add(word);
				word = "";
			} else {
				word += c;
			}
		}
		list.add(word);
		return list.get(list.size() - 1).length();
	}

	// 100ms
	public static int lengthOfLastWordOp(String s) {
		String str = s.trim();
		int len = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isLetter(str.charAt(i))) {

				len++;
			} else {
				break;
			}
		}
		return len;
	}

}
