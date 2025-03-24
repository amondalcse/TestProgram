import java.util.HashMap;

public class SplitStringAndDigitAndReverseString
{
    public static void main(String[] args) {
        String str = "abcovejavaprogram";
        int count=0;
        //String ch[] = str.split("/s");
        char[] chars = str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length()-1;j++){
                if(chars[i]==chars[j]){
                    System.out.print(chars[i]+""+count);
                    count++;
                    break;
                }

            }


        }



    }

}
