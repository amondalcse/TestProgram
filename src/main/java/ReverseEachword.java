public class ReverseEachword
{
    public static void main(String args[]){
        String str="love India";
        String reverseString =" ";
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            String word =words[i];
            String str1=" ";
            char ch;
            for(int j=0;j<word.length();j++){
                ch =word.charAt(j);
                str1=ch+str1;
            }
            reverseString = reverseString+str1+" ";
        }
        System.out.println(reverseString);
    }

}
