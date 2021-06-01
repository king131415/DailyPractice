package javaDailyProctice.sort;

import java.util.Arrays;

public class Testsort {//Static修饰的方法不能重写
    //插入排序     1  2  3  0  5  6
    // 如果数组相对有序，排序的效率是很高的;稳定排序
    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j]; //不满足升序,元素往后搬运
                }else {
                    break; //待排序区间的第一个元素比已排序区间最后一个元素大，跳出本次循环
                }
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,6,8};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
