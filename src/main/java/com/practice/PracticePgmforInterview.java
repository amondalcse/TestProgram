package com.practice;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class PracticePgmforInterview {


    public static void main(String[] args) {
      int[] a ={1,2,3,4,5,2};
      int newLength=1;
      for(int i=0;i<a.length;i++){
          int j;
          for( j=0;j<a.length;j++){
              if(a[i]==a[j]){
                  break;
              }
          }
          if(j==newLength){
              a[newLength] =a[i];
              newLength++;
          }
      }
      for(int i=0;i<newLength;i++){
          System.out.print(a[i]);
      }

    }

}




