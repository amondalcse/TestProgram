package array.com;

import java.util.Arrays;

public class LeftRotate
{
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle k > n
        rotateLeftHelper(arr, 0, k - 1); // Reverse first k elements
        rotateLeftHelper(arr, k, n - 1); // Reverse remaining elements
        rotateLeftHelper(arr, 0, n - 1); // Reverse the whole array
    }

    private static void rotateLeftHelper(int[] arr, int left, int right) {
        if (left >= right) return; // Base case: stop when pointers meet
        swap(arr, left, right);
        rotateLeftHelper(arr, left + 1, right - 1); // Recursive call
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateLeft(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
