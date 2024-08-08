class Trie {

        private class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;
        
        TrieNode() {
            children = new TrieNode[26]; 
            isEndOfWord = false;
        }
    }

    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
  
    public void insert(String word) {
        TrieNode curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEndOfWord == true;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root; 

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */