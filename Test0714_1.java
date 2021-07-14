package javaDailyProctice.Test0714_1;

import java.util.Arrays;

public class Test0714_1 {
     //希尔排序的本质就师插排的升级版
    private static void ShellSort(int[] arr){
        int gap=arr.length/2;
        while (gap>=1){
            for(int i=gap;i<arr.length;i++){
                int j=i-gap;
                int v=arr[i]; //创建零时变量保存起来每次要插入的对象
                for(;j>=0;j-=gap){ //
                    if(arr[j]>v){
                        arr[j+gap]=arr[j];
                    }else {
                        break; //找到合适的位置插入
                    }
                }
                arr[j+gap]=v;
            }
            gap=gap/2;
        }
    }



    public static void main(String[] args) {
        int[] arr={4,2,7,1,9,8,6,5};
        ShellSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
