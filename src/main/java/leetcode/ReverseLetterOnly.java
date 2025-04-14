package leetcode;

public class ReverseLetterOnly {
    public static void main(String[] args) {
        String str = "a,b,c,@,!";
        char[] arr = str.toCharArray();

        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Skip special characters
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                // Swap letters
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Reversed string: " + new String(arr));
    }
}

