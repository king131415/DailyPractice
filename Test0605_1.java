package javaDailyProctice.Test0605;

import java.util.Arrays;

public class Test0605_1 {
    public static void main(String[] args) {
        int[] arr={9,3,6,8,4,1};
        selectsor(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectsor(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                     int tem=arr[i];
                     arr[i]=arr[j];
                     arr[j]=tem;
                 }
            }
        }
    }
}
