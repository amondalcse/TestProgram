package com.string2;


public class RepeatEnd
{
    public static String repeatEnd(String str, int n){
        String end =str.substring(str.length() -n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(end);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.print(repeatEnd("Hello",3));
    }
}
