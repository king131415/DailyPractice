package javaDailyProctice.Test0521;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        Solution solusion=new Solution();
        int[] arr={2,7,11,15};
        int target=9;
        int[] result=solusion.twoSum(arr,9);
        if (result.length==2 && result[0]==0 && result[1]==1){
            System.out.println("TestCase OK!");
        }else {
            System.out.printf("TestCase Failed! nums = [2,7,11,15], target = 9");
        }
        int[] arr1={3,2,4};
        int target1 = 6;
        int[] result2=solusion.twoSum(arr1,target1);
        if(result2.length==2 && result2[0]==1 && result2[1]==2){
            System.out.println("TestCase OK!");
        }else {
            System.out.println("TestCase Failed! nums = [3,2,4], target = 6");
        }
    }
}