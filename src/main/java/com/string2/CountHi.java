package com.string2;

import java.util.StringTokenizer;

public class CountHi
{
    public static int countHi(String str){
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        /*String str = "ABChi hi";
        int c = countHi(str);
        System.out.print(c);*/

            System.out.print(countHi("abc hi ho")); //→ 1
            System.out.print(countHi("ABChi hi")); //→ 2
            System.out.print(countHi("hihi")); //→ 2

    }
}
