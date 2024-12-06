package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode15ThreeSum {

	public static void main(String[] args) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> ans;
		ans = threeSumBetter(arr);
		System.out.println("The triplets are as follows: ");
		for (int i = 0; i < ans.size(); i++) {
			for (int j = 0; j < ans.get(i).size(); j++) {
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

	public static List<List<Integer>> threeSumBrute(int[] nums) {
		Set<List<Integer>> st = new HashSet<>();
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					List<Integer> temp = new ArrayList<>();
					if (nums[i] + nums[j] + nums[k] == 0) {
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);
					}
					Collections.sort(temp);
					if (temp.size() != 0) {
						st.add(temp);
					}
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}

	public static List<List<Integer>> threeSumBetter(int[] nums) {
		Set<List<Integer>> st = new HashSet<>();
		Set<Integer> set = null;
		for (int i = 0; i < nums.length; i++) {
			set = new HashSet<>();
			for (int j = i + 1; j < nums.length; j++) {
				int third = -(nums[i] + nums[j]);
				List<Integer> temp = new ArrayList<>();
				if (set.contains(third)) {
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(third);
					Collections.sort(temp);
					if (temp.size() != 0) {
						st.add(temp);
					}
				}

				set.add(nums[j]);
			}
		}
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}

}
