package javaDailyProctice.Test0719;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 *
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 *
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 */

public class Test0719_2 {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set=new TreeSet<>();
        int count=1;//定义一个计数器变量
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                count++; //符合规则，计数器加一
            }else if(nums[i+1]==nums[i]){
                continue; //相等就继续遍历
            } else{
                //相差大于一不符合规则，把之前的计数器值放到set集合中去
                //这里要注意的是要使用Treeset,因为可以借助它排序
                set.add(count);
                count=1;//计数器值置为一
            }

        }
     //1  3    6
        set.add(count);
        Object[] objects = set.toArray(); //转化成为数组

        return (Integer)objects[set.size()-1];
    }

    public static void main(String[] args) {
        int[] arr={0,2,3,4,6,8,9,10,11,12,13};
        int result=longestConsecutive(arr);
        System.out.println(result);
    }
}
