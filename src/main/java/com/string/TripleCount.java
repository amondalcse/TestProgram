package com.string;

public class TripleCount
{
    public static int tripleCount(String str) {
        int count=0;
        for(int i=0;i<str.length()-2;i++){
            char ch =str.charAt(i);
            if(ch==str.charAt(i+1) && ch ==str.charAt(i+2)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "abcXXXabcyyy";
        int c =tripleCount(str);
        System.out.print(c);
    }
}


    /*public static int tripleCount(String str){
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char ch = str.charAt(i);
            if (ch == str.charAt(i + 1) && ch == str.charAt(i + 2)) {
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {   8/

/*
countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 */
        //String str = "abcXXXabc";
        /*String str = "xxxabyyyycd";
        int c =tripleCount(str);
        System.out.print(c);


    }*/