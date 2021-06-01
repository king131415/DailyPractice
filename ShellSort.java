package javaDailyProctice.sort;

import java.util.Arrays;

public class ShellSort {
    //希尔排序,本质就是加强版的插入排序;不稳定排序,因为要分组
    public static void ShellSort(int[] arr){
        int gap=arr.length/2;  //定义分组下标
        while (gap>=1){
            _shellSort(arr,gap);
            gap=gap/2;
        }
    }
    public static void _shellSort(int[] arr, int gap) {
        for(int i=gap;i<arr.length;i++){
            int temp=arr[i];  //拿出待排序区间的第一个数，和已排序区间比较
            int j=i-gap;
            for(;j>=0;j-=gap){
                if(arr[j]>temp){
                    arr[j+gap]=arr[j];  //进行元素搬运
                }else {
                    break;
                }
            }
            arr[j+gap]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={7,2,4,6,9,1};
        ShellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
