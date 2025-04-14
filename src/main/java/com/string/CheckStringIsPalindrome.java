package com.string;

import java.util.Locale;

public class CheckStringIsPalindrome
{
    public static void main(String[] args) {
        String str="madaM";
        String reverseString = "";
        for(int i=str.length()-1;i>=0;i--){
            reverseString+=str.charAt(i);
        }
        //System.out.print(reverseString);
        if(str.toLowerCase().equals(reverseString.toLowerCase())){
            System.out.print("The string are palindrome");
        }else{
            System.out.print("The string are not palindrome");
        }

    }
}
