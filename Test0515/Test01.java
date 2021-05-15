package javaDailyProctice.Test0515;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//微信红包问题[1,2,3,2,2] 5    ==>2  //腾讯笔试题
public class Test01 {
    public static int getValue(int[] gifts, int n) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < gifts.length; i++) {
            if (m.containsKey(gifts[i])) {  //判断是否包含数组中的数
                //如果包含，取出对应的值进行加一
                m.put(gifts[i], m.get(gifts[i]) + 1);
            } else {
                //如果map中没有这个数，添加进去并且把对应的值设为1
                m.put(gifts[i], 1);
            }
        }
        //遍历map
        for(Integer i:m.keySet()){
            int munber=n/2;
            int a=m.get(i);
            if(a>munber) {
                //如果值大于总数(n)的一半，就把对应的键返回
                return i;
            }
        }
        //没有就返回0
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,2};
        System.out.println(getValue(arr,5));

    }
}
