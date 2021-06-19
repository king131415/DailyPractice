package javaDailyProctice.Test0619_1;

import java.util.Arrays;

public class Test0619_2 {
    public static void main(String[] args) {
        int[] arr={6,5,8,2,10,9};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        _mergeSort(arr,0,arr.length);
    }

    private static void _mergeSort(int[] arr, int left, int right) {
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        _mergeSort(arr,left,mid);
        _mergeSort(arr,mid,right);
        meger(arr,left,mid,right);
    }

    private static void meger(int[] arr, int left,int mid, int right) {
        int cur1=left;
        int cur2=mid;
        int tempindex=0;//记录元素的下标
        int[] temp=new int[right-left];
        while (cur1<mid && cur2 <right){
             if(arr[cur1]<=arr[cur2]){
                 temp[tempindex]=arr[cur1];
                 tempindex++;
                 cur1++;
             }else {
                 temp[tempindex]=arr[cur2];
                 tempindex++;
                 cur2++;

             }
        }
        while (cur1<mid){
            temp[tempindex]=arr[cur1];
            tempindex++;
            cur1++;
        }
        while (cur2<right){
            temp[tempindex]=arr[cur2];
            tempindex++;
            cur2++;
        }
        //拷贝会原来数组
        for(int i=0;i<temp.length;i++){
            arr[left+i]=temp[i];
        }
    }

}
