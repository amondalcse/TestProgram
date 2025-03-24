package leetcode;

public class SortArrayWithoutInbuildMethod
{
    public static void selectionSort(int[] array){
        int n= array.length;
        for(int i=0;i<=n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    public static void main(String args[]){
        int[] array = {3,4,2,5,0,7,1};
        selectionSort(array);
        for (int num : array){
            System.out.print(num +" ");
        }
    }
}
