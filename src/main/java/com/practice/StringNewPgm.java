package com.practice;

import java.util.Arrays;

public class StringNewPgm
{
    public static void main(String[] args) {
        char[] s1 = {'A', 'B', 'C', 'D', 'E', 't', 'Z'};
        char[] s2 = {'c', 'd', 'e', 'f'};

        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        // Merge elements alternately from s1 and s2
        while (i < s1.length || j < s2.length) {
            if (i < s1.length) {
                result.append((result.length() % 2 == 0) ? Character.toLowerCase(s1[i]) : s1[i]);
                i++;
            }
            if (j < s2.length) {
                result.append((result.length() % 2 == 0) ? Character.toLowerCase(s2[j]) : Character.toUpperCase(s2[j]));
                j++;
            }
        }

        // Convert to array and print result
        System.out.println(Arrays.toString(result.toString().toCharArray()));
    }
}
