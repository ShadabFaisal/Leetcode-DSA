package String;

public class LeetCode557ReverseWordsInAStringIII {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));

	}
	public static String reverseWords(String s) {

		String[] s1 = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length; i++) {
			sb.append(reverse(s1[i]));
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	public static String reverse(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}

}
