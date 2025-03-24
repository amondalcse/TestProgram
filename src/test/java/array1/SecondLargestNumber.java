package array1;

public class SecondLargestNumber
{public static void main(String args[]){
    int temp, size;
    int array[] = {10, 20, 25, 63, 96, 57};
    int secondLargestNumber= array[0];
    int largestNumber=array[0];
    size = array.length;

    for(int i = 0; i<size; i++ ) {
        if (array[i] >largestNumber) {
            largestNumber = array[i];
        }
    }
    for(int i=0;i<size;i++){
        if( array[i] > secondLargestNumber && array[i]!=largestNumber){
            secondLargestNumber =array[i];
        }
    }


    System.out.println("Third second largest number is:: "+secondLargestNumber);
}
}

