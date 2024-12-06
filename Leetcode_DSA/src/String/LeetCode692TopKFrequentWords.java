package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode692TopKFrequentWords {

	public static void main(String[] args) {
		String[] words= {"i","love","leetcode","i","love","coding"};
		int k=2;	
		System.out.println(topKFrequent(words,k));

	}

	public static List<String> topKFrequent(String[] words, int k) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<String> res = new ArrayList<>();

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		PriorityQueue<WordFrequency> pq = new PriorityQueue<>(
				(a, b) -> a.count == b.count ? a.word.compareTo(b.word) : b.count - a.count);

		for (String key : map.keySet()) {
			pq.offer(new WordFrequency(key, map.get(key)));
		}

		for (int i = 0; i < k; i++) {
			WordFrequency wf = pq.poll();
			res.add(wf.word);
		}
		return res;
	}
}

class WordFrequency {
	String word;
	int count;

	public WordFrequency(String key, int value) {
		this.word = key;
		this.count = value;
	}
}
