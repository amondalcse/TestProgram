package com.string;

public class ConvertStringaToCharArray {
    public static void main(String[] args) {
        String str = "Abhijit";
        char[] ch =str.toCharArray();
        //System.out.print(str.getClass().getName());
        for( char c:ch){
            System.out.print(c);
        }
       // System.out.print(ch.getClass().getName());
    }
}
