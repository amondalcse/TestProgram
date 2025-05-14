package com.string;

public class EqualIsNot
{
    public static boolean equalNot(String str){
        int isCount=0;
        int notCount=0;

        for(int i=0;i<=str.length()-2;i++){
            if(str.substring(0,i+2).equals("is")){
                isCount++;
            }
        }
        for(int i=0;i<str.length()-3;i++){
            if(str.substring(0,i+3).equals("not")){
                notCount++;
            }
        }
        return isCount==notCount;
    }

    public static void main(String[] args) {
            String str = "This is notnot";
            Boolean b =equalNot(str);
            System.out.print(b);

        /*
        Examples:
        equalIsNot("This is not") → false (is = 2, not = 1)
        equalIsNot("This is notnot") → true (is = 2, not = 2)
        equalIsNot("noisxxnotyynotxisi") → true (is = 3, not = 3)
         */
    }
}
