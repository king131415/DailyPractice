package javaDailyProctice.Test0611;

import java.util.Arrays;

public class Test0611_2 {
    public static void main(String[] args) {
        int[] arr={1,4,6,3,7,9,8};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    //插入排序
    private static void insertSort(int[] arr) {
        int bound=1;
        for(;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-1;
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
}
