public class ArmStrong
{
    public static void main(String[] args) {
        int no=153;
        int rem=0,p=0;
        int temp=no;
        while(no>0) {
            rem = no % 10;
            p = p + (rem * rem * rem);
            no = no / 10;
        }
        if(temp == p){
            System.out.println("the Number is Armstrong");
        }
        else{
            System.out.println("The Number is not ArmStrong");
        }
    }
}
