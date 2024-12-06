package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode56MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 1, 4 }, { 4, 5 } };
		int[][] ans = mergeBrute(intervals);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i][0] + "->" + ans[i][1] + " ");
		}

	}

	public static int[][] mergeBrute(int[][] intervals) {

		int n = intervals.length;
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		List<int[]> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];

			if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (intervals[j][0] <= end) {
					end = Math.max(end, intervals[j][1]);
				} else {
					break;
				}
			}
			ans.add(new int[] { start, end });
		}
		return ans.toArray(int[][]::new);
	}

	public static int[][] mergeOptimised(int[][] intervals) {
		int n = intervals.length;
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		List<int[]> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			// if the current interval does not
			// lie in the last interval:
			if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]) {
				ans.add(new int[] { intervals[i][0], intervals[i][1] });
			} else {
				ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
			}
		}

		return ans.toArray(int[][]::new);
	}

	public static int[][] merge(int[][] intervals) {
		List<int[]> res = new ArrayList<>();

		if (intervals.length == 0 || intervals == null) {
			return res.toArray(new int[0][]);
		}
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		int start = intervals[0][0];
		int end = intervals[0][1];

		for (int[] i : intervals) {
			if (i[0] <= end) {
				end = Math.max(end, i[1]);
			} else {
				res.add(new int[] { start, end });
				start = i[0];
				end = i[1];
			}
		}
		res.add(new int[] { start, end });
		return res.toArray(new int[0][]);
	}

}
