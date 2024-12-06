package Trie;

public class LeetCode208ImplementTrie {

	private static TrieNode root;

	public LeetCode208ImplementTrie() {
		root = new TrieNode();
	}

	public void insert(String word) {

		TrieNode node = root;
		for (char ch : word.toCharArray()) {
			if (!node.containsKey(ch)) {
				node.put(ch, new TrieNode());
			}
			// moves to the reference trie
			node = node.get(ch);
		}
		node.setEnd();

	}

	public boolean search(String word) {
		TrieNode node = root;
		for (char ch : word.toCharArray()) {
			if (!node.containsKey(ch)) {
				return false;
			}
			node = node.get(ch);
		}

		if (node.isEnd()) {
			return true;
		}
		return false;
	}

	public boolean startsWith(String prefix) {
		TrieNode node = root;
		for (char ch : prefix.toCharArray()) {
			if (!node.containsKey(ch)) {
				return false;
			}
			node = node.get(ch);
		}
		return true;
	}

	public static void main(String[] args) {
		LeetCode208ImplementTrie trie=new LeetCode208ImplementTrie();
		trie.insert("apple");
		trie.insert("tpple");
		trie.insert("people");
		
		System.out.println(trie.search("peple"));
		System.out.println(trie.startsWith("app"));
	}
}
