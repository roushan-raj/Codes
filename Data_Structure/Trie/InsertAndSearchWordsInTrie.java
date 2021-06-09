
public class InsertAndSearchWordsInTrie {
	
	private InsertAndSearchWordsInTrie [] children;
	boolean isWord;
	public InsertAndSearchWordsInTrie() {
		children = new InsertAndSearchWordsInTrie[26];
		isWord = false;
	}
	
	// Adding words in Trie
	public void addWord(String word) {
		InsertAndSearchWordsInTrie curr = this;
		for (char c: word.toCharArray()) {
			if(curr.children[c - 'a'] == null)
				curr.children[c - 'a'] = new InsertAndSearchWordsInTrie();
			curr = curr.children[c - 'a'];
		}
		curr.isWord = true;
	}
	
	// Searching words from Trie
	public boolean search(String word) {
		InsertAndSearchWordsInTrie curr = this;
		for (int i=0; i<word.length(); ++i) {
			char c = word.charAt(i);
			if(c == '.') {
				for (InsertAndSearchWordsInTrie ch: curr.children)
					if(ch != null && ch.search(word.substring(i+1)))
						return true;
				return false;
			}
			if(curr.children [c -'a'] == null)
				return false;
			curr = curr.children[c - 'a'];
		}
		return curr != null && curr.isWord;
	}
    
	// Main Function
	public static void main(String[] args) {
		 
		InsertAndSearchWordsInTrie ob = new InsertAndSearchWordsInTrie();
		
		ob.addWord("cat");
		ob.addWord("catch");
		ob.addWord("can");
		ob.addWord("cap");
		
		System.out.println(ob.search("cat"));
		System.out.println(ob.search("c.t"));
		System.out.println(ob.search("..t"));
		System.out.println(ob.search("cata"));
		System.out.println(ob.search("catc"));

	}

}
