package javaDailyProctice.Test0609;

import java.util.Arrays;

public class Test0609 {
    public static void insert(int[] arr){
        int bound=1;
        for(;bound<arr.length;bound++){
            int k=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(arr[cur]>k){
                    arr[cur+1]=arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+1]=k;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,2,5,7,8,10};
        insert(arr);
        System.out.println(Arrays.toString(arr));

    }
}
