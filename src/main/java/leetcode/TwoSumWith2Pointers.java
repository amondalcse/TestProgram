package leetcode;

public class TwoSumWith2Pointers
{
    public static int[] twoSum(int[] numbers, int target){
        int left =0;
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum ==target){
                return new int[]{left+1, right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] numbers={0, -1, 2, -3, 1};
        int target= 2;
        int[] result = twoSum(numbers,target);
        if(result.length==2){
            System.out.println("indecies" +result[0] +","+result[1]);
        }else{
            System.out.println("no of element not found with sum" +target);
        }

    }
}
