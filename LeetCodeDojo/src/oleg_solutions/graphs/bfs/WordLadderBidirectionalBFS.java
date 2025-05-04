package oleg_solutions.graphs.bfs;

import java.util.*;

record State5(String word, int level) {
}

public class WordLadderBidirectionalBFS {
    private final Map<String, List<String>> graph = new HashMap<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
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
        Queue<State5> beginQueue = new LinkedList<>();
        Queue<State5> endQueue = new LinkedList<>();
        Map<String, Integer> beginSeen = new HashMap<>();
        Map<String, Integer> endSeen = new HashMap<>();
        beginQueue.add(new State5(beginWord, 1));
        endQueue.add(new State5(endWord, 1));
        beginSeen.put(beginWord, 1);
        endSeen.put(endWord, 1);
        var ans = Integer.MIN_VALUE;
        while (!beginQueue.isEmpty() && !endQueue.isEmpty()) {
            ans = (beginQueue.size() <= endQueue.size()) ?
                    proccessLevel(beginQueue, beginSeen, endSeen) :
                    proccessLevel(endQueue, endSeen, beginSeen);
            if (ans > 0) {
                return ans;
            }
        }
        return 0;
    }

    private int proccessLevel(Queue<State5> queue, Map<String, Integer> seen, Map<String, Integer> otherSeen) {
        var levelSize = queue.size();
        for (int i = 0; i < levelSize; i++) {
            var cur = queue.poll();
            var curWord = cur.word();
            var level = cur.level();
            for (var key : getAllKeys(curWord)) {
                if (graph.containsKey(key)) {
                    for (var word : graph.get(key)) {
                        if (otherSeen.containsKey(word)) {
                            return level + otherSeen.get(word);
                        }
                        if (!seen.containsKey(word)) {
                            queue.offer(new State5(word, level + 1));
                            seen.put(word, level + 1);
                        }
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
