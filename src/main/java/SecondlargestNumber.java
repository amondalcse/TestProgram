public class SecondlargestNumber
{
    public static void main(String args[]){
        int x[]={-90,-90,-90,67,4,-9,55,6,3,67};

        int largest= 0;
        int secondLargest= 0;
        int thirdLargest=0;
        int num= x.length;
        System.out.println(num);

        for(int i=0;i<num;i++) {
            if (x[i] > largest) {
                largest = x[i];
            }
        }
            for (int i = 0; i < num; i++) {

                // Update second largest if the current element is greater
                // than second largest and not equal to the largest
                if (x[i] > secondLargest && x[i] != largest) {
                    secondLargest = x[i];
                }
            }
            for(int i=0;i<num;i++){
                if(x[i]>thirdLargest && x[i] !=secondLargest && x[i] !=largest){
                    thirdLargest=x[i];
                }
            }
        System.out.println("largest is "+ largest);
        System.out.println("2nd largest is "+ secondLargest);
        System.out.println("3rd largest is " + thirdLargest);
        }




}
