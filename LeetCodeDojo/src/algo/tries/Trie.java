package algo.tries;

import java.util.*;

public class Trie {
    // note: using a class is only necessary if you want to store data at each node.
    // otherwise, you can implement a trie using only hash maps.
    class TrieNode {
        Map<Character, TrieNode> children;
        int data;

        TrieNode() {
            this.children = new HashMap<>();
        }
    }

    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode curr = root;
            for (char c : word.toCharArray()) {
                if (!curr.children.containsKey(c)) {
                    curr.children.put(c, new TrieNode());
                }

                curr = curr.children.get(c);
            }

            // at this point, you have a full word at curr
            // you can perform more logic here to give curr an attribute if you want
        }

        return root;
    }
}