package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test
{
    public static void main(String[] args) {
        /*String a ="abc";
        String b ="abc";
        String c = new String("abc");
        String d= new String("abc");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(c.concat("world"));
        System.out.println(c);
        System.out.println(c==d);
        System.out.println(c.equals(d));*/

        //Reverse array without using loop


        //Find the missing number



        //Find the duplicate element
        /*int[] a ={1,2,3,4,2,1};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print("print the duplicate element"  + " " +a[i]);
                }
            }
        }*/
        /*int[] a={1,2,-4,4,9,6,8};
        int target=7;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.print("Indices of"+ ""+a[i] +" : "+a[j]);
                }
            }
        }*/

        //find the 2 missing number in array

        int arr[]={1,3,5,7,9,8,4}; //given size=9; o/p should be = 2,6
        int n = arr.length+2;
        int sumArray=0;
        int totalArray = n*(n+1)/2;
        Set set = new HashSet();
        for(int num: arr){
            set.add(num);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                System.out.print(i);
            }
        }
       // System.out.print(totalArray-sumArray);

    }
}
