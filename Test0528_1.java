package javaDailyProctice.Test0528;

import java.util.Arrays;

public class Test0528_1 {
    //  9   5   4  6  10   7   8
    //  7   5   4  6   8   9   10
    public static void QuickSort(int[] arr){
        int left=0;
        int right=arr.length-1;
        _QuickSort(arr,left,right);
    }

    public static void _QuickSort(int[] arr,int left,int right) {
        if(left>=right){
            return;
        }
       int index=partition(arr,left,right);
        _QuickSort(arr,left,index-1);
        _QuickSort(arr,index+1,right);

    }

    private static int partition(int[] arr, int left, int right) {
        int l=left;
        int r=right;
        int value=arr[left];
        while (l<r){
            //右边出发找一个比目标小的值
            while (l<r && arr[r]>=value){
                r--;

            }
            while (l<r && arr[l]<=value){
                l++;
            }
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        int temp=arr[l];
        arr[l]=arr[left];
        arr[left]=temp;
        return l;
    }

    public static void main(String[] args) {
        int[] arr={1 ,6,5,8,9};
        QuickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
