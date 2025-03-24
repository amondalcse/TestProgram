public class FibonacciSeries
{
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        System.out.print(a);
        System.out.print(b);
        for(int i=0;i<=10;i++ ){
            c= a+b;
            a=b;
            b=c;
            System.out.print(c);
        }


    }
}
