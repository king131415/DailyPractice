package javaDailyProctice.Test0712;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test0712_1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new TreeMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(10,11);
        map.put(5,6);
        for(Map.Entry<Integer,Integer> entry:map.entrySet() ){
            System.out.println(entry.getValue());
        }
    }
}
