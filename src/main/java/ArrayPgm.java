import java.util.HashMap;

public class ArrayPgm
 {
    public static void main(String[] args) {
        int[] a = {6, 8, 11, 6, 7, 18};
        int target = 17;

        int[] result = findTwoSum(a, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two elements found with sum " + target);
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Stores number & its index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required pair

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices
            }
            map.put(nums[i], i); // Store element index
        }
        return new int[]{}; // No solution found
    }
}
/*{
    public static void main(String args[]){
        int[] a = {6, 8, 1, 6, 7, 16};
        int target = 17;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println("print the a value "+a[i]);
                    System.out.println("print the b value"+a[j]);
                    System.out.println("True  and print the index of i"+a[i] +"and index of j" +a[j]);
                }
            }
        }
    }
}*/
