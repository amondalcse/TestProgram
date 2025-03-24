import java.util.*;

public class TestDebug {

    public static void main(String args[])
    {
        /*String str="abhijitkumarr";
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        Set<Character> set = map.keySet();
        for(Character c1:set){
            if(map.get(c1)>1){
                System.out.println(c1 +"-->"+map.get(c1));
            }
        }*/

       // String str = "I love India love";
       /* HashMap<String,Integer> map = new HashMap<>();
        for(String ch:str.split(" ")){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.print(map);*/
        /*String[] words = str.split(" ");
        int length = words.length;
        System.out.print(length);*/
        /*int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.print(count);*/

        //Anagram
       /* String str ="abtijhi";
        String str1 ="abhitij";
        if(str.length()!=str1.length()){
            System.out.print("String are not Anagram");
        }
        char[] ch= str.toCharArray();
        char[] ch1=str1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        System.out.println(ch);
        System.out.println(ch1);

        System.out.print(Arrays.equals(ch,ch1));*/

        String str= "abhijit";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j)){

                }
            }
        }




    }
}
