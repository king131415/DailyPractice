package javaDailyProctice.Test0701;

import java.util.Arrays;

public class Test0701_1 {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,3,7,10};
        QuickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void QuickSort(int[] arr) {
        _quickSort(arr,0,arr.length-1);
    }

    private static void _quickSort(int[] arr, int left, int rigt) {
        if(left>=rigt){
            return;
        }
        int index=partion(arr,left,rigt);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,rigt);
    }

    private static int partion(int[] arr, int left, int rigt) {
        int l=left;
        int r=rigt;
        int data=arr[rigt];
        while (l<r){
            //从左边出发，找一个比目标值大的数
            while (l<r && arr[l]<=data){
                l++;
            }
            //从右边出发找一个比目标值小的数
            while (l<r && arr[r]>=data){
                r--;
            }
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

        }
        //左右指针重合处,和目标值交换
        int temp=arr[rigt];
        arr[rigt]=arr[l];
        arr[l]=temp;
        return l;
    }
}
