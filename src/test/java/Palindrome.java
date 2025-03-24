import java.util.Locale;
import java.util.Scanner;


public class Palindrome
{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("original String: ");
        String originalString = sc.nextLine();//madam
        sc.close();
        //boolean ispalindrome = true;
        String reverseString = " ";
        for(int i=originalString.length()-1;i>=0;i--) {
            reverseString = reverseString + originalString.charAt(i);
        }
            if(originalString.equals(reverseString))
                System.out.print("String is palindrome");

                else
                    System.out.print("String is not palindrome");



    }
}
