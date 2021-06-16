package javaDailyProctice.Test0616;

import java.util.Arrays;

public class Test0616_2 {
    public static void main(String[] args) {
        int[] arr={2,5,6,8,7,3,9};
        mergrSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergrSort(int[] arr) {
        _mergeSort(arr,0,arr.length);

    }

    private static void _mergeSort(int[] arr, int left, int right) {
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        //递归左边区间
        _mergeSort(arr,left,mid);
        //递归右边区间
        _mergeSort(arr,mid,right);
        //合并左右区间
        merge(arr,left,mid,right);
    }

    //2,5,6,8,7,3,9
    public static void merge(int[] arr,int left,int mid,int right){
       int cur1=left;
       int cur2=mid;
       int[] temp=new int[right-left];
       int tempindex=0;
       while (cur1<mid && cur2<right){
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
       while (cur1<mid){  //左边区间有剩余
           temp[tempindex]=arr[cur1];
           tempindex++;
           cur1++;
       }
       while (cur2<right){
           temp[tempindex]=arr[cur2];
           tempindex++;
           cur2++;
       }
       for(int i=0;i<temp.length;i++){
           arr[left+i]=temp[i];
       }

    }
}
