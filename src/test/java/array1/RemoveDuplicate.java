package array1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate
{
    public static void main(String[] args){
        int[] arr = {1,2,3,2,5};

        Set<Integer> set = new HashSet<>();

        for (int num: arr){
            set.add(num);
        }
        System.out.print(set);
    }
}
