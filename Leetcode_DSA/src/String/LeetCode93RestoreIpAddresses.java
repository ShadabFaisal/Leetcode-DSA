package String;

import java.util.ArrayList;
import java.util.List;

public class LeetCode93RestoreIpAddresses {

	private static List<String> res = new ArrayList<>();

	public static List<String> restoreIpAddresses(String s) {
		helper(s, 0, 0, "");
		return res;
	}

	public static void helper(String s, int i, int par, String ans) {
		if (i == s.length() || par == 4) {
			if (s.length() == i && par == 4) {
				res.add(ans.substring(0, ans.length() - 1));
			}
			return;
		}

		helper(s, i + 1, par + 1, ans + s.charAt(i) + ".");
		if (i + 2 <= s.length() && isValid(s.substring(i, i + 2)))
			helper(s, i + 2, par + 1, ans + s.substring(i, i + 2) + ".");
		if (i + 3 <= s.length() && isValid(s.substring(i, i + 3)))
			helper(s, i + 3, par + 1, ans + s.substring(i, i + 3) + ".");
	}

	public static boolean isValid(String str) {
		if (str.charAt(0) == '0') {
			return false;
		}
		int val = Integer.parseInt(str);
		return val <= 255;
	}

	public static void main(String[] args) {
		String s = "25525511135";
		System.out.println(restoreIpAddresses(s));

	}

}
