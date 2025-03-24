public class FindUpperCaseAndLowerCase
{
    public static void main(String[] args) {
        String str = "AbhIJiT";
        String upper=" ";
        String lower=" ";
        int uCount=0;
        int lCount=0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch>=65 && ch<=90){
                lower = lower+ch;
                lCount++;
            }
            else{
                upper = upper +ch;
                uCount++;
            }
        }
        System.out.println(upper+"-->Count is -->"+uCount);
        System.out.println(lower+"-->Count is -->"+lCount);
    }
}
