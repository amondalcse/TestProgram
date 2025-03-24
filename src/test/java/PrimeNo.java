public class PrimeNo
{
    public static void main(String[] args)
    {
        int flag;
        for(int i=1;i<=50;i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (int j = 2; j <=i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }


            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
            
        
    }
}
