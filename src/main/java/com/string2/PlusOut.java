package com.string2;

public class PlusOut
{
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));         // ++xy++
        System.out.println(plusOut("12xy34", "1"));          // 1+++++
        System.out.println(plusOut("12xy34xyabcxy", "xy"));  // ++xy++xy+++xy
    }

    public static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                result.append(word);
                i += word.length(); // Skip the word
            } else {
                result.append('+');
                i++;
            }
        }

        return result.toString();

    }
}
