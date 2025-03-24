package array.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);

        System.out.print("with duplicate"+ list);

        Set<Integer> set = new HashSet<>(list);
        System.out.print("without duplicate"+ set);


    }
}
