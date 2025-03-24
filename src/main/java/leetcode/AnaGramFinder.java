package leetcode;

import java.util.*;

public class AnaGramFinder {
    public static int findAnagram(List<String> words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            anagramGroups.putIfAbsent(sortedWord, new ArrayList<>());
            anagramGroups.get(sortedWord).add(word);
        }

        for (List<String> group : anagramGroups.values()) {
            if (group.size() == 1) {
                System.out.println(1);
            } else {
                System.out.println(group);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "silent", "ilnste", "test");
        findAnagram(words);
    }
}
