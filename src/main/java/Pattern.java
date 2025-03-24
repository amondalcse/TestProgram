public class Pattern
{
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
       // pattern3(5);
        //pattern4(5);
       // pattern5(5);
        //diamondpattern1(5);
        //pattern6(5);
    }


static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=0;row< 2*n;row++){
            int noOfColumn=row>n?2*n-row:row;
            for(int col=0;col<noOfColumn;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void diamondpattern1(int n){
        for(int row=0;row< 2*n;row++)
        {
            int noOfColumn=row>n?2*n-row:row;

            int noOfSpaces= n - noOfColumn;

            for(int s=0;s< noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col=0;col<noOfColumn;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row=1;row<=n;row++){

            for(int s =0;s< n-row;s++){
                System.out.print("  ");
            }

            for(int col=row;col>=1;col--){
                System.out.print(col + " ");
            }
            for( int col=2;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
