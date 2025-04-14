package array.com;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement
{
    public static void main(String[] args) {
        int[] arr ={1,2,3,2,5};

        /*Set<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);

        }
        System.out.println(set);*/
        int newLength=1;
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(j==newLength){
                arr[newLength]=arr[i];
                newLength++;
            }
        }
        for(int i=0;i<newLength;i++){
            System.out.print(arr[i]);
        }



    }
}
