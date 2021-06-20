package javaDailyProctice.Test0620;

import java.util.Arrays;

public class Test0620_2 {
    public static   void heapSort(int[] arr){
       createheap(arr);
       int heapsize=arr.length;

       for(int i=0;i<arr.length;i++){
           int temp=arr[0];
           arr[0]=arr[heapsize-1];
           arr[heapsize-1]=temp;
           heapsize--;
           shiftdown(arr,0,heapsize);
       }

    }

    private static void createheap(int[] arr) {
        //向下调整，建堆，要从后往前遍历
        for(int i=arr.length-1;i>=0;i--){
           shiftdown(arr,i,arr.length);
        }
    }
    public static void shiftdown(int[] arr,int temp,int size){
        int parent=temp;
        int child=2*parent+1;
        while (child<size){
            if(child+1<size && arr[child]<arr[child+1]){
                child=child+1;

            }
            if(arr[child]>arr[parent]){
                int temps=arr[child];
                arr[child]=arr[parent];
                arr[parent]=temps;

            }else {
                break;
            }
            parent=child;
            child=2*parent+1;
        }
    }

    public static void main(String[] args) {
        int[] arr={5,2,6,8,1,10,11,19};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
