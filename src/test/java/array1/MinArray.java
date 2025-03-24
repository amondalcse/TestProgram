package array1;

public class MinArray
{
    public static void main(String[] args) {


        int arr[] = {2,3,7,5};
        int min=arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
            if (min > arr[i]) {
                min =arr[i];


            }else if(max < arr[i]){
                max= arr[i];

            }

            //System.out.println(max);
        }
        System.out.println(min);
        System.out.println(max);

    }
}
