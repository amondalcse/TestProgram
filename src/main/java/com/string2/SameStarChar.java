package com.string2;

public class SameStarChar
{
    public static boolean sameStarChar(String str){
        for(int i=1;i<str.length()-1;i++)
        {
            if(str.charAt(i)=='*')
            {
                if(str.charAt(i-1)!=str.charAt(i+1))
                {
                    return false;
                }
            }


        }

        return true;

    }
    public static void main(String[] args) {

        System.out.print(sameStarChar("xy*yzz"));
        System.out.print(sameStarChar("xy*zzz"));
        System.out.print(sameStarChar("*xa*az"));
        /*
        sameStarChar("xy*yzz") → true
        sameStarChar("xy*zzz") → false
        sameStarChar("*xa*az") → true
         */
    }
}
