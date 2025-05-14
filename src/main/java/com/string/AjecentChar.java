package com.string;

public class AjecentChar
{
    public static int maxBlock(String str){
        if(str.isEmpty()){
            return 0;
        }
        int max=0;
        int current=1;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                current++;
                if(current>max){
                    max=current;
                }
            }else{
                current=1;
            }

        }
        return max;
    }

    public static void main(String[] args) {

        String str ="abbCCCddBBBxx";
        int s =maxBlock(str);
        System.out.print(s);
        /*
        maxBlock("hoopla") → 2
        maxBlock("abbCCCddBBBxx") → 3
        maxBlock("") → 0
         */

    }
}
