package javaDailyProctice.Test0606;

import java.util.Arrays;

public class HeapTest {
    //向下调整(大堆）
    private static void shiftDown(int[] arr,int size,int index){

        int parent =index;
        int child=2*parent+1; //左孩子下标
        while (child<size){ //循环调整
            if(child+1<size && arr[child+1]>arr[child]){
                child=child+1;
            }
            if(arr[parent]<arr[child]){
                int tem=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tem;
            }else {
                break;
            }
            parent=child; //更新引用的位置，进行下次循环
            child=2*parent+1;
        }
    }
    //向上调整(大堆）
    public static void shiftUp(int[] arr, int size, int index) {
        int child = index;
        int parent = (child - 1) / 2;
        // 如果 child 为 0, 说明已经调整到最上面了
        while (child > 0) {
            if (arr[parent] < arr[child]) {
                // 不符合大堆的要求
                // 交换两个元素
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
            } else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr={4,2,5,7,8,100};
//        向下调整建堆，只能从后往前遍历
//        for(int i=arr.length-1;i>=0;i--){
//            shiftDown(arr,arr.length,i);
//
//        }
//
        //向上调整建堆，需要从前往后遍历
        for(int i=0;i<arr.length;i++){
            shiftUp(arr,arr.length,i);
        }
        System.out.println(Arrays.toString(arr));

    }

}
