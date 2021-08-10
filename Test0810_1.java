package javaDailyProctice.Test0810;

import java.util.Arrays;

public class Test0810_1 {
    public static  void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }

    private static void _quickSort(int[] arr, int left, int right) {
        if(left>=right){
            return;
        }
        int index=partion(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }

    private static int partion(int[] arr, int left, int right) {
        int l=left;
        int r=right;
        int v=arr[right];
        while (l<r){
            while (l<r && arr[l]<=v){
                l++;
            }
            while (l<r && arr[r]>=v){
                r--;
            }
            int temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
        }
        int temp=arr[l];
        arr[l]=arr[right];
        arr[right]=temp;
        return l;
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,8,7,10,9};
//        quickSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
}
