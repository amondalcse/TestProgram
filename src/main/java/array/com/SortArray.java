package array.com;

public class SortArray
{
    public static void selectionSort(int[] array){
        int n= array.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[minIndex]){
                    minIndex =j;
                }
            }
            int temp =array[i];
            array[i] =array[minIndex];
            array[minIndex]=temp;
        }
    }

    public static void main(String[] args) {
        int[] array={1,4,3,6,2,0};
        selectionSort(array);
        for(int num: array){
            System.out.print(num+ " ");
        }
    }
}
