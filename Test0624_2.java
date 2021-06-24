package javaDailyProctice.Test0624;

import java.util.Arrays;

public class Test0624_2 {
    public static void main(String[] args) {
        int[] arr={5,7,9,10,2,3,8};
        ShellSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void ShellSort1(int[] arr) {
        int gap=3; //希尔分组
        while (gap>=1){
            int i=gap;
            for(;i<arr.length;i++){
                int var=arr[i];
                int j=i-gap;
                for(;j>=0;j-=gap){
                    if(arr[j]>var){
                        arr[j+gap]=arr[j];
                    }else {
                        break;
                    }
                }
                arr[j+gap]=var;
            }
            gap--; //分组系数要变小
        }

    }

}
