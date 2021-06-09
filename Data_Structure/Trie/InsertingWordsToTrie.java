
public class InsertingWordsToTrie {
	
	private TrieNode root;
	
	public InsertingWordsToTrie() {
		root = new TrieNode();
	}
	
	private class TrieNode {
		private TrieNode[] children;
		private boolean isWord;
		
		public TrieNode() {
			this.children = new TrieNode[26];
			this.isWord = false;
		 }

		public boolean search(String substring) {
			return true;
		}  
	}
	
	// inserting words to Trie
	public void insert (String word) {
		if (word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		word = word.toLowerCase();
		
		TrieNode current =root;
		for (int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if(current.children[index] == null) {
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node;
			} else {
				current = current.children[index];
			}
		}
		current.isWord = true;
	}
	
	// Searching words in Trie
	public boolean search(String word) {
		TrieNode curr = root;
		for (int i=0; i<word.length(); ++i) {
			char c = word.charAt(i);
			if(c == '.') {
				for (TrieNode ch: curr.children)
					if(ch != null && ch.search(word.substring(i+1)))
						return true;
				return false;
			}
			if(curr.children [c - 'a'] == null)
				return false;
			curr = curr.children[c - 'a'];
		}
		return curr != null && curr.isWord;
	}
	
    // Main function
	public static void main(String[] args) {
		 
		InsertingWordsToTrie ob = new InsertingWordsToTrie();
		ob.insert("cat");
		ob.insert("cab");
		ob.insert("son");
		ob.insert("so");
		ob.insert("catch");
		ob.insert("can");
		ob.insert("cap");
		System.out.println("Words inserted successfully !!!");
		
		System.out.println(ob.search("cat"));
		System.out.println(ob.search("c.t"));
		System.out.println(ob.search("..t"));
		System.out.println(ob.search("cata"));
		System.out.println(ob.search("catc"));

	}

}
