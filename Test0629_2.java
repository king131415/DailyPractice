package javaDailyProctice.Test0629_1;

import java.util.Arrays;

public class Test0629_2 {
    public static void main(String[] args) {
        int[] arr={7,3,6,8,1,10};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        //先建堆,向下调整
        for(int i=arr.length-1;i>=0;i--){
            shiftDown(arr,i,arr.length);
        }
        //拿堆顶元素和堆的最后一个元素交换，再堆的大小减一即可
        int heapsize=arr.length; //一开始的堆的大小就等于数组的长度
        for(int i=0;i<arr.length;i++){
            int temp=arr[0];
            arr[0]=arr[heapsize-1];
            arr[heapsize-1]=temp;
            heapsize--;
            shiftDown(arr,0,heapsize);
        }

    }
    public  static void shiftDown(int[] arr,int index,int size){
        int praren=index;
        int child=2*praren+1;
        while (child<size){
            if(child+1<size && arr[child]<arr[child+1]){
                child=child+1;
            }
            if(arr[praren]<arr[child]){
                int temp=arr[praren];
                arr[praren]=arr[child];
                arr[child]=temp;
            }
            praren=child;
            child=2*praren+1;
        }

    }
}
