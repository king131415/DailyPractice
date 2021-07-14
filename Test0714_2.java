package javaDailyProctice.Test0714_1;

import java.util.Arrays;

public class Test0714_2 {
    private static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }

    private static void _quickSort(int[] arr, int left, int right) {
        if(left>=right){
            return;
        }
        int index=Partion(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }

    private static int Partion(int[] arr, int left, int right) {
        int l=left;
        int r=right;
        int v=arr[left];//基准值
        while (l<r){
            while (l<r && arr[r]>=v){
                r--;
            }
            while (l<r && arr[l]<=v){
                l++;
            }
            int temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
        }
        int temp=arr[l];
        arr[l]=arr[left];
        arr[left]=temp;
        return l;
    }


    public static void main(String[] args) {
        int[] arr={4,2,7,1,9,8,6,5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
