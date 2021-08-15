package javaDailyProctice.Test0815;

import java.util.Arrays;

public class Test0815_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] arr = twoSum(nums, 6);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr1 = new int[2]; //创建一个数组用来接收下标
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr1[0] = i;
                    arr1[1] = j;
                    return arr1; //找到了直接返回
                }
            }
        }
        return null; //没找到

    }
}
