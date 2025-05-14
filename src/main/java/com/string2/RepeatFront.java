package com.string2;

public class RepeatFront
{
    public static String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        //for(int i=n;i>0;i--){
            //sb.append(str.substring(0,i));
        for(int i=0;i<n;i++){
            sb.append(str.substring(0,n));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

       System.out.print(repeatFront("Chocolate", 2));
        /*
        repeatFront("Chocolate", 4) → "ChocChoChC"
        repeatFront("Chocolate", 3) → "ChoChC"
        repeatFront("Ice Cream", 2) → "IcI"
         */
    }
}
