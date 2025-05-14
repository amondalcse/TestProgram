package com.string2;

public class CatDog
{

    public static boolean catDog(String str){
        int catCount=0;
        int dogCount=0;
         for(int i=0;i<str.length()-2;i++){
             String sub = str.substring(i,i+3);
             if(sub.equals("cat")){
                 catCount++;
             }else if(sub.equals("dog")){
                 dogCount++;
             }

         }
        return catCount==dogCount;
    }
    public static void main(String[] args) {
        String str = "catcat";
        boolean b = catDog(str);
        System.out.print(b);

        /*
        catDog("catdog") → true
        catDog("catcat") → false
        catDog("1cat1cadodog") → true
         */
    }
}
