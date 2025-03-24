package array.com;

public class LargestAndSmallestNumber
{
    public static void main(String[] args) {
        int[] num={1,2,5,7,9,10,0};
        int largest =num[0];
        int smallest = num[0];

        /*for(int n: num){
            if(n < smallest){
                smallest =n;
            }
            if (n > largest){
                largest = n;
            }
        }*/
        for(int i=0;i<num.length;i++){
            if(num[i]<smallest){
                smallest=num[i];
            }
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("Largest Number is " +largest);
        System.out.println("Smallest Number is :" +smallest);
    }
}
