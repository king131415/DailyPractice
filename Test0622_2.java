package javaDailyProctice.Test0622_1;

import java.util.Arrays;

public class Test0622_2 {
    public static void main(String[] args) {
        int[] arr={3,1,6,4,7,8,10};
        QuikSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
     //  8   5    4   6   12    6
    private static void QuikSort(int[] arr,int left,int right) {

       _quikSort(arr,left,right);

    }

    private static void _quikSort(int[] arr, int left, int right) {
        if(left>=right){
            return;
        }
        int index=partion(arr,left,right);
        _quikSort(arr,left,index-1);
        _quikSort(arr,index+1,right);
    }


    private static int partion(int[] arr, int left, int right) {
        int l=left;
        int r=right;
        int data=arr[right];
        while (l<r){
            while (l<right && arr[l]<=data){
                l++;
            }
            while (r>l && arr[r]>data){
                r--;
            }
            //交换找到的两个元素
            int tenp=arr[l];
            arr[l]=arr[r];
            arr[r]=tenp;
        }
        int temp=arr[right];
        arr[right]=arr[l];
        arr[l]=temp;
        return l;
    }
}
