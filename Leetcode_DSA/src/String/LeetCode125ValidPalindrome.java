package String;

public class LeetCode125ValidPalindrome {

	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(actual);
		String rev = new StringBuffer(actual).reverse().toString();
		System.out.println(actual.equals(rev));
	}

}
