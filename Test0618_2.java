package javaDailyProctice.Test0618;

import java.util.Arrays;

public class Test0618_2 {
    public static void bufferSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,6,1,7,9,10};
        System.out.println(Arrays.toString(arr));
        bufferSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
