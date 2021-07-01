package javaDailyProctice.Test0701;

import java.util.Arrays;

public class Test0701_2 {
    public static void main(String[] args) {
        int[] arr={2,5,1,9,10,6};
        ChangeSort(arr);
        System.out.println("选择排序为:");
        System.out.println(Arrays.toString(arr));
        System.out.println("冒泡排序为:");
        BoofbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
   //冒泡paixu
    private static void BoofbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //选择paixu
    private static void ChangeSort(int[] arr) {
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
}
