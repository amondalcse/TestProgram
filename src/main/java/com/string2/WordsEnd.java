package com.string2;

public class WordsEnd
{
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));  // c13i
        System.out.println(wordEnds("XY123XY", "XY"));        // 13
        System.out.println(wordEnds("XY1XY", "XY"));          // 11
    }

    public static String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int len = word.length();

        for (int i = 0; i <= str.length() - len; i++) {
            if (str.substring(i, i + len).equals(word)) {
                // Add char before word, if it exists
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                // Add char after word, if it exists
                if (i + len < str.length()) {
                    result.append(str.charAt(i + len));
                }
            }
        }

        return result.toString();
    }
}
