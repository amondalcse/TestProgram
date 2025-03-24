package array.com;

public class MissingNumberInArray
{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6};
        int n = array.length+1; //6
        int totalSum= n *(n+1) /2; //15
        int arraySum =0;

        for(int num : array){
            arraySum+=num;
        }
        System.out.println(totalSum-arraySum);
    }
}
