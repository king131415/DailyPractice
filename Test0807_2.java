package javaDailyProctice.Test0807;

import java.util.Arrays;

public class Test0807_2 {
    public static void main(String[] args) {
        int[] arr={3,1,6,7,8,10,9};
        mergerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergerSort(int[] arr) {
        
        _mergerSort(arr,0,arr.length);
    }


    private static void _mergerSort(int[] arr, int left, int right) {
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        _mergerSort(arr,left,mid);
        _mergerSort(arr,mid,right);
        merger(arr,left,mid,right);
    }

    private static void merger(int[] arr, int left, int mid, int right) {

        int l=left;//4   8,10,9
        int m=mid;//5
        int r=right;//6
        int[] temp=new int[right-left];
        int index=0;
        while (l<mid && m<right){
            if(arr[l]<=arr[m]){
                temp[index]=arr[l];
                l++;
                index++;
            }else {
                temp[index]=arr[m];
                index++;
                m++;
            }
        }
        while (l<mid){
            temp[index++]=arr[l];
            l++;
        }
        while (m<right){
            temp[index++]=arr[m];
            m++;
        }

        for(int i=0;i<temp.length;i++){
            arr[left++]=temp[i];
        }

    }
}
