package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindTwoSumWithPair
{
    public static void main(String[] args) {
        int[] arr={6, 12, 18, 6, 1, 16};
        int sum=17;
        findTwoSumPairs(arr,sum);
    }

    public static void findTwoSumPairs(int[] arr, int sum){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = sum-arr[i];
            if(map.containsKey(complement)){
                System.out.print("found the pairs "+arr[i] +"  "+complement);
                return;
            }
            map.put(arr[i],i);
        }
}
}
