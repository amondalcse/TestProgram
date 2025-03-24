import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        int sumFirst = 0;
        int sumLast = 0;
        int arr[] = {5, 11, 2, 8, 9, 13, 13};
        for (int i = 0; i < arr.length; ) {
            sumFirst = sumFirst + arr[i];
            System.out.println(sumFirst);

            for (int j = arr.length - 1; j >= 0; j--) {
                sumLast = sumLast + arr[j];
                System.out.println(sumLast);
                i++;
                //System.out.print());
            }
            if (sumFirst == sumLast) {
                System.out.println(arr[i]);
            }

        }
        //System.out.println("Sum from the first index->"+sumFirst);
        //System.out.println("Sum from the last index->"+sumLast);

    }
}

