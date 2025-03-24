package com.test;

import java.io.IOException;

public class ExceptionTest
{
    public static void main(String args[])
    {
       try{
           int i=9/0;
           throw new NullPointerException("Abhijit");

       }catch(NullPointerException e){
           System.out.print("exception");
       }catch(Exception e){
           System.out.println("Hii Exception");
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("Finally block executed");
       }
    }

}
