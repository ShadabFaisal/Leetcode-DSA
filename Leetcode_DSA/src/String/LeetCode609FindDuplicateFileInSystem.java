package String;

import java.util.*;

public class LeetCode609FindDuplicateFileInSystem {

	public static void main(String[] args) {
		String[] paths= {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
		List<List<String>> dup=findDuplicate(paths);
		System.out.println(dup);
	}

	public static List<List<String>> findDuplicate(String[] paths) {

		Map<String, List<String>> store = new HashMap<String, List<String>>();

		for (String path : paths) {
			String[] arr = path.split(" ");
			String directory = arr[0];
			for (int i = 1; i < arr.length; i++) {
				String fileName = arr[i].substring(0, arr[i].indexOf("("));
				String content = arr[i].substring(arr[i].indexOf("("), arr[i].length() - 1);
				List<String> filePaths = store.getOrDefault(content, new ArrayList<>());
				filePaths.add(directory + "/" + fileName);
				store.put(content, filePaths);
			}
		}
		store.entrySet().removeIf(entry -> entry.getValue().size() < 2);

		return new ArrayList<List<String>>(store.values());
	}

}
