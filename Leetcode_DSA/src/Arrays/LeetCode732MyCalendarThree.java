package Arrays;

import java.util.TreeMap;

class LeetCode732MyCalendarThree {
	TreeMap<Integer, Integer> timeline;

	public LeetCode732MyCalendarThree() {
		timeline = new TreeMap<Integer, Integer>();
	}

	public int book(int start, int end) {
		timeline.put(start, timeline.getOrDefault(start, 0) + 1);
		timeline.put(end, timeline.getOrDefault(end, 0) - 1);

		int ongoing = 0, max = 0;

		for (int v : timeline.values()) {
			max = Math.max(max, ongoing += v);
		}
		return max;
	}
}
