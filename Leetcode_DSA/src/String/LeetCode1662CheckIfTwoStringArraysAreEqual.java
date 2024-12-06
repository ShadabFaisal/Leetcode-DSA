package String;

public class LeetCode1662CheckIfTwoStringArraysAreEqual {

	public static void main(String[] args) {
		String[] s1 = { "ab", "c" };
		String[] s2 = { "a", "bc" };
		System.out.println(arrayStringsAreEqual2(s1,s2));
	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		String s1 = "";
		String s2 = "";

		for (String str : word1) {
			s1 += str;
		}
		for (String s : word2) {
			s2 += s;
		}
		return s1.equals(s2);
	}

	public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {

		//String s1 = String.join("", word1);
		//String s2 = String.join("", word2);
		
		return String.join("", word1).equals(String.join("", word2));
		//return s1.equals(s2);
	}

	public static boolean arrayStringsAreEqualOptimal(String[] word1, String[] word2) {

		if (word1.length == 0 || word2.length == 0)
			return false;
		StringBuilder arr1 = new StringBuilder();
		StringBuilder arr2 = new StringBuilder();
		for (int i = 0; i < Math.max(word1.length, word2.length); i++) {
			if (i < word1.length) {
				arr1.append(word1[i]);
			}

			if (i < word2.length) {
				arr2.append(word2[i]);
			}
		}
		return arr1.toString().equals(arr2.toString());
	}

}
