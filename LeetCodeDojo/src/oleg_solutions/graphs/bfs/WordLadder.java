package oleg_solutions.graphs.bfs;

import java.util.*;

public class WordLadder {
    private final Map<String, List<String>> graph = new HashMap<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        buildGraph(wordList);
        return bfs(beginWord, endWord);
    }

    private void buildGraph(List<String> wordList) {
        for (var word : wordList) {
            for (var key : getAllKeys(word)) {
                if (!graph.containsKey(key)) {
                    graph.put(key, new ArrayList<>());
                }
                graph.get(key).add(word);
            }
        }
    }

    private List<String> getAllKeys(String word) {
        var result = new ArrayList<String>();
        for (var i = 0; i < word.length(); i++) {
            var key = new StringBuilder();
            key.append(word, 0, i);
            key.append('*');
            key.append(word, i + 1, word.length());
            result.add(key.toString());
        }
        return result;
    }

    private int bfs(String beginWord, String endWord) {
        Queue<String> queue = new LinkedList<>();
        Set<String> seen = new HashSet<>();
        queue.offer(beginWord);
        seen.add(beginWord);
        var level = 0;
        while (!queue.isEmpty()) {
            level++;
            var levelSize = queue.size();
            for (var i = 0; i < levelSize; i++) {
                var curWord = queue.poll();
                for (var key : getAllKeys(curWord)) {
                    if (graph.containsKey(key)) {
                        for (var word : graph.get(key)) {
                            if (word.equals(endWord)) {
                                return level + 1;
                            }
                            if (!seen.contains(word)) {
                                queue.offer(word);
                                seen.add(word);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
