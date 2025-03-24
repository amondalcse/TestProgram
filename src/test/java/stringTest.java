public class stringTest
{
    public static void main(String[] args) {
        String str= "I love java programming";
        String str1="";
        String[] ch = str.split("");
        for(int i=ch.length-1;i>=0;i--){
            str1= str1+str.charAt(i);

        }
        System.out.println(str1);
    }
}
