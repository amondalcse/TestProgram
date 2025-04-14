package com.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString
{
    public static void main(String[] args) {
        String str="abhijita";
        String result =" ";
        for(int i=0;i<str.length();i++){
            boolean found=false;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) {
                    found = true;
                    break;

                }

            }
            if(!found){
                result+=str.charAt(i);
            }
        }
        System.out.print(result);

        /*Set<Character> set = new HashSet();

        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));

        }*/



    }
}
