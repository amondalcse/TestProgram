public class RepeatedCharacter
{
    public static void main(String[] args) {
        String str = "abhijit mondal";
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' '){
                   count++;
                    System.out.println("print the repeat character:="+str.charAt(i)+":"+count);
                }

            }

        }

    }
}
