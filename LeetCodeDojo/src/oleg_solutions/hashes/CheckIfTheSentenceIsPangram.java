package oleg_solutions.hashes;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public static boolean solution(String sentence) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
