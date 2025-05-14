package leetcode;

public class BigestNumber
{
    public static void main(String[] args){
        String str ="abc86rd9";
        int max_digit = -1;


        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                char ch= str.charAt(i);
                int dig = ch - '0';
                if(dig>max_digit){
                    max_digit=dig;
                }


                }

            }
        System.out.print(max_digit);

        }




}
