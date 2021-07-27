package javaDailyProctice.Test0727;

import java.util.Arrays;

public class Test0727_2 {
    public static void quikSort(int[] arr){
        _quickSort(0,arr.length-1,arr);
    }

    private static void _quickSort(int left, int right, int[] arr) {
        if(left>=right){
            return;
        }
        int index=Partion(left,right,arr);
        _quickSort(left,index-1,arr);
        _quickSort(index+1,right,arr);

    }

    private static int Partion(int left, int right, int[] arr) {
        int l=left;
        int r=right;
        int data=arr[left];
        while (l<r){
            while (l<r && arr[r]>=data){
                r--;
            }
            while (l<r && arr[l]<=data){
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
        int[] arr={2,4,7,10,7,5,6};
        quikSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
