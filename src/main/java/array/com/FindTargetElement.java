package array.com;

public class FindTargetElement
{
    public static int linearSearch(int[] array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }else{

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array ={1,2,4,6,7};
        int target=4;
        int index = linearSearch(array,target);
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("index not found");
        }
    }
}
