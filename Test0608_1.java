package javaDailyProctice.Test0608;

import java.util.Arrays;

public class Test0608_1 {
   //插入排序
    public static void insertSort(int[] arr){
        // 5   8    4    6   7   9    2
       for(int bound=1;bound<arr.length;bound++){
           int v=arr[bound];
           int cur=bound-1;//已排序区间
           for(;cur>=0;cur--){
               if(arr[cur]>v){
                   arr[cur+1]=arr[cur];
               }else {
                   break;
               }
           }
           arr[cur+1]=v;
       }
    }
    public static void main(String[] args) {
        int[] arr={ 5,8,4,6,7,9,2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
