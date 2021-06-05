package javaDailyProctice.Test0605;

import java.util.Arrays;

public class Test0605 {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,7,8};
        bublesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bublesort(int[] arr) {
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
}
