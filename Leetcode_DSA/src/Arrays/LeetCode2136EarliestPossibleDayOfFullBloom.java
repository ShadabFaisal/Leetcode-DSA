package Arrays;

import java.util.*;

public class LeetCode2136EarliestPossibleDayOfFullBloom {

	public static void main(String[] args) {
		int[] plantTime = { 1, 4, 3 };
		int[] growTime = { 2, 3, 1 };
		System.out.println(earliestFullBloom(plantTime, growTime));
	}

	public static int earliestFullBloom(int[] plantTime, int[] growTime) {
		List<Seed> plant = new ArrayList<>();
		for (int i = 0; i < plantTime.length; i++) {
			plant.add(new Seed(plantTime[i], growTime[i]));
		}

		Collections.sort(plant, (a, b) -> (b.growTime - a.growTime));
		int time = 0;
		int max = 0;
		for (int i = 0; i < plantTime.length; i++) {
			time += plant.get(i).plantTime;
			max = Math.max(max, time + plant.get(i).growTime);
		}
		return max;

	}

	private static class Seed {
		int plantTime;
		int growTime;

		public Seed(int p, int g) {
			this.plantTime = p;
			this.growTime = g;
		}
	}

}
