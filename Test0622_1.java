package javaDailyProctice.Test0622_1;

import java.util.Arrays;

public class Test0622_1 {
    public static void main(String[] args) {
        int[] arr={8,2,5,1,9,4,6};
        megerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void megerSort(int[] arr) {
        _merger(arr,0,arr.length);
    }

    private static void _merger(int[] arr, int left, int right) {
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        _merger(arr,left,mid);
        _merger(arr,mid,right);
        merger(arr,left,mid,right);
    }

    private static void merger(int[] arr, int left, int mid, int right) {
        int cur1=left;
        int cur2=mid;
        int[] temp=new int[right-left];
        int tenpindex=0;
        while (cur1<mid && cur2 <right){
            if(arr[cur1]<=arr[cur2]){
                temp[tenpindex]=arr[cur1];
                tenpindex++;
                cur1++;
            }else {
                temp[tenpindex]=arr[cur2];
                tenpindex++;
                cur2++;
            }
        }
        while (cur1<mid){
            temp[tenpindex]=arr[cur1];
            tenpindex++;
            cur1++;
        }
        while (cur2<right){
            temp[tenpindex]=arr[cur2];
            tenpindex++;
            cur2++;
        }
        for(int i=0;i<temp.length;i++){
            arr[left+i]=temp[i];
        }
    }
}
