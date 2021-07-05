package javaDailyProctice.Test0705_Hashmap;

import java.util.*;

public class Test_HashSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        new Hashtable<>()
        //添加元素(重复元素会添加失败）
        set.add("王婆");
        set.add("王婆");
        System.out.println("========");
        //清空集合
        set.clear();
        //添加元素
        set.add("java");
        set.add("C");
        set.add("C++");
        set.add("C#");
        System.out.println(set);
        //遍历set
        //方式一
        for(String value:set){
            System.out.println(value);
        }
        System.out.println("============");
        //方式二
        //获取迭代器对象
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //判断是否包含某个元素
        System.out.println(set.contains("C"));
        System.out.println(set.contains("javaScript"));

        //判断set集合是否为空
        System.out.println(set.isEmpty());

    }
}
