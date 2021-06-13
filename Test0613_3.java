package javaDailyProctice.Mysort;

import java.util.Arrays;

public class Test0613_3 {
    public static void SlecteSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){ //控制打擂台的次数
            for(int j=bound+1;j<arr.length;j++){ //和数组里其他元素一次比较
                if(arr[bound]>arr[j]){
                    int temp=arr[bound];
                    arr[bound]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={9,5,7,2,3,6,8};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        SlecteSort(arr);
        System.out.println("选择排序后："+"==>"+"升序");
        System.out.println(Arrays.toString(arr));
    }
}
