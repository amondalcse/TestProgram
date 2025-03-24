public class stringManupulation
{
    public static void main(String[] args) {
       String str="abhijit love java";
        /* String str1=" ";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.print(str1);*/
        /*StringBuffer bf = new StringBuffer(str);
        System.out.print(bf.reverse());*/

        /*String words[]=str.split(" ");
       String str1=" ";

       for(int i=words.length-1;i>=0;i--){
           String word = words[i];
           System.out.print(word +" ");
       }*/
       //System.out.print(str1);
       String[] words = str.split(" ");
        String reverseString =" ";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String str1 =" ";
            char ch;
            //System.out.print(word);

            for(int j=0;j<word.length();j++){
                ch=word.charAt(j);

                str1 = ch+str1;
                //System.out.print(str1);

            }
            reverseString= reverseString+str1+ " ";

        }
        System.out.print(reverseString);
        /*String[] str1= str.split(" ");
        int length = str1.length;
        System.out.print(length);*/



    }
}
