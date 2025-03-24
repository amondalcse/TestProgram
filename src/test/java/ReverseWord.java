import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("original String : ");

        String originalString = sc.nextLine();
        sc.close();
        String words[] = originalString.split("\\s");
        String reversedString=" ";
        /*for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }

        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}*/


        for(int i=0;i<words.length;i++){
            if(i == words.length-1)
                reversedString = words[i] + reversedString;

                else{
                    reversedString = " " +  words[i] + reversedString;
                }
            }
        System.out.println("Reversed String:"+reversedString);
        }

    }


