package javaDailyProctice.Test0724;

import java.util.Arrays;

public class Test0724_2 {
    public static void SelectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={12,5,6,1,3,7,9,8};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
