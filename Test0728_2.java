package javaDailyProctice.Test0728;

import java.util.Arrays;

public class Test0728_1 {
    public static void main(String[] args) {
        int[] arr={8,2,5,1,9,4,6};
        megerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void megerSort(int[] arr) {
        _merger(arr,0,arr.length);
    }
    //  4   5   6   8    9   10
    private static void _merger(int[] arr, int left, int right) {
        if(right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        //拆分左边
        _merger(arr,left,mid);
        //拆分右边
        _merger(arr,mid,right);
        //合并最小单元
        merger(arr,left,mid,right);
    }

    private static void merger(int[] arr, int left, int mid, int right) {
        int cur1=left;
        int cur2=mid;
        //创建零时空间
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
        //左边还是有剩余
        while (cur1<mid){
            temp[tenpindex]=arr[cur1];
            tenpindex++;
            cur1++;
        }
        //右边还有剩余
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
