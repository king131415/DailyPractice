package javaDailyProctice.Test0624;

import java.util.Arrays;

public class Test0624_1 {
    public static void main(String[] args) {
           int[] arr={5,4,1,6,9,10,3};
           insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
  //插入排序
    private static void insertSort(int[] arr) {
        int i=1;
        for(;i<arr.length;i++){
            int var=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>var){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=var; //放到合适的位置
        }
    }
}
