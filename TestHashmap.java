package javaDailyProctice.Test0705_Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class TestHashmap {
    public static void main(String[] args) throws InterruptedException {
      Map<String,String> map =new HashMap<>();

        //一开始初始化HashMap的时候,里面没有任何的键值对
        //如果获取的化，就会返回空
        String value = map.get("行者");
        System.out.println(value);
        //如果没有，可以设置返回默认值;如果有就返回原有的value
        String orDefault = map.getOrDefault("行者", "武松");
        System.out.println(orDefault);
        System.out.println("======================");
        //添加操作(重复的Key会覆盖原来的Value的值）
        map.put("及时雨", "宋江");
        map.put("玉麒麟","卢俊义");
        map.put("黑旋风","李逵");
        map.put("行者","武松");
        map.put("行者","武大郎他弟");

        //遍历HashMap
        //方式一通过Map转成Set,来进行遍历
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("===================================");
        //方式二：单独遍历所有的Key和Value ==>其原理还是转成Set,然后通过迭代器遍历
        for(String key: map.keySet()){
            System.out.println(key);
        }
        System.out.println("=====================================");
        for(String Value: map.values()){
            System.out.println(Value);
        }
        //判断map是否为空
        System.out.println(map.isEmpty());

        //map的大小
        System.out.println(map.size());

        //清空Map前
        System.out.println("清空Map前:");
        System.out.println(map);

        //清空map
        map.clear();
        //清空map后
        System.out.println("清空Map后:");
        System.out.println(map);



    }
}
