package array.com;

import sun.lwawt.macosx.CSystemTray;

public class SecondLargestElement
{
    public static void main(String[] args) {
        int[] num ={1,5,7,9,12};
        int largest =num[0];
        int secondLargest=num[0];

        for(int n: num){
            if(n >largest){
                largest =n;
            }
        }
        for(int n: num){
            if(n >secondLargest && n!=largest){
                secondLargest=n;
            }
        }
        System.out.println(secondLargest);
    }
}
