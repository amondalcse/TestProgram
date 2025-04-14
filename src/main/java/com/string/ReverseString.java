package com.string;

public class ReverseString
{
    public static void main(String[] args) {
        String str="abhijit";
        String reverseString=" ";

        for(int i=str.length()-1;i>=0;i--){
            reverseString+=str.charAt(i);
        }
        System.out.print(reverseString);
    }
}
