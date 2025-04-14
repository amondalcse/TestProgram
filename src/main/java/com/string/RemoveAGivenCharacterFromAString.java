package com.string;

public class RemoveAGivenCharacterFromAString
{
    public static void main(String[] args) {
        String str ="abhijit";
        char removeChar ='t';
        String afterRemove=" ";
        boolean found=false;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) != removeChar) {
                sb.append(str.charAt(i));
                //found=true;
                //break;
            }/*else if(!found){

            }*/
        }
            /*if(!found){
                afterRemove+=str.charAt(i);
            }*/
        System.out.println(sb);


    }

}
