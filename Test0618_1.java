package javaDailyProctice.Test0618;

import java.util.Arrays;

public class Test0618_1 {

    public static void qucikSort(int[] arr){

        _quickSort(arr,0,arr.length-1);
    }

    public static void _quickSort(int[] arr, int left, int right) {
        if(left>right){
            return;
        }

        int index=partion(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }
    public static int partion(int[] arr,int left,int right){
        int l=left;
        int r=right;
        int tempVaue=arr[right];
        while (l<r){
            //从左边出发
            while (l<r && arr[l]<=tempVaue){
                l++;
            }
            while (l<r && arr[r]>=tempVaue){
                r--;

            }
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        int temp=arr[right];
        arr[right]=arr[l];
        arr[l]=temp;
        return l;
    }


    public static void main(String[] args) {
        int[] arr={2,1,4,9,5,8};
        System.out.println(Arrays.toString(arr));
        qucikSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
