public class NoOfWordsInString
{
    public static void main (String args[]){
        /*String str ="I love my India";
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.print(count);
*/

        //Vowel and consonant

       /* String str ="Abhijit";
        str=str.toLowerCase();
        int vowel=0,consonant=0;
        for(char ch:str.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){

                vowel++;
            }else{
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);*/
        String str ="I love India";
        String[] words = str.split(" ");
        System.out.print(words.length);
    }

}
