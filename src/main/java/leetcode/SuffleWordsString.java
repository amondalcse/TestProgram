package leetcode;

import java.util.Arrays;

public class SuffleWordsString
{
    public static String suffleWords(String str)
    {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words)
            if (word.length() > 2)
            {
                char first = word.charAt(0);
                System.out.println(first);
                char last = word.charAt(word.length()-1);
                System.out.println(last);
                char[] middle = word.substring(1, word.length()-1).toCharArray();
                //Arrays.sort(middle);
                System.out.println(middle);

                result.append(last).append(new String(middle)).append(first).append(" ");
            } else {
                result.append(word).append(" ");
            }

        return result.toString().trim();
    }



    public static void main(String args[]){
        String str = "I am Software Engineer";
        String result = suffleWords(str);
        System.out.println(result);
    }
}
