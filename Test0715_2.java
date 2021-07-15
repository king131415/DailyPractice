package javaDailyProctice.Test0715Code;


import java.util.*;

/**
 * 找出数组中重复的数字。并且把重复的数字都找出来
 */


public class Test0715_2 {
    public  static int findRepeatNumber(int[] nums) {
       Set<Integer> set1=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           if(set1.add(nums[i])){
               continue;
           }else {
               map.put(i,nums[i]);
//              return nums[i];
           }
       }
       for (Map.Entry<Integer,Integer> m:map.entrySet()){
           System.out.println(m.getValue());
       }
       return 0;
    }

    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        findRepeatNumber(nums);
    }
}
