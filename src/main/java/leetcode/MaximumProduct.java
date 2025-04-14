package leetcode;

import java.util.Arrays;
import java.util.Map;

public class MaximumProduct
{
    public static void main(String[] args) {
        int[] num = {-10, -3, 5, 6, -2};
        maxPoduct(num);

    }
    public static void maxPoduct(int[] num){
        Arrays.sort(num);
        int n =num.length;

        int pod1 =num[n-1] * num[n-2];
        int pod2 =num[0]*num[1];

        int maxPod = Math.max(pod1,pod2);

        System.out.print(maxPod);
    }
}
