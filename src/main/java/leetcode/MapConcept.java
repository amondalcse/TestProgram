package leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapConcept
{
    int result=0;
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",5);
        map.put("c",7);
        for(Map.Entry<String, Integer> m: map.entrySet()){
            int result =m.getValue()+1;
            System.out.println(result);
        }




    }

}
