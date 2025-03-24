package array.com;

import java.util.HashSet;
import java.util.Set;

public class CommonElementBetweenTwoArray
{
    public static Set<Integer> findsCommonElements(int[] array, int[] array1){
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonElement = new HashSet<>();

        for(int num : array){
            set.add(num);
        }
        for(int num: array1){
            if(set.contains(num)){
                commonElement.add(num);
            }
        }
        return commonElement;
    }

    public static void main(String[] args) {
        int[] array ={1,2,4,6,3,7};
        int[] array1 ={7,8,9,3,2};

        Set<Integer> commonElements = findsCommonElements(array,array1);
        {
            for(int num: commonElements){
                System.out.print(num);
            }
        }
    }
}
