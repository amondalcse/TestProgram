package com.string2;

public class XyBalance
{
    public static boolean xyBalance(String str){
        int lastX=-1;
        int lastY=-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='x'){
                lastX=i;

            }else if(str.charAt(i)=='y'){
                lastY=i;
            }
        }
        return lastX==-1  || lastY>=lastX;
    }
    public static void main(String[] args) {
        String str = "yaaxbb";
        System.out.print(xyBalance(str));
        /*
        xyBalance("aaxbby") → true
        xyBalance("aaxbb") → false
        xyBalance("yaaxbb") → false
         */

    }
}
