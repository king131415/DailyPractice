package javaDailyProctice.Mysort;

import java.util.Arrays;

public class Test0613_4 {
    public static  void HeapSort(int[] arr){
        //1.先建堆(大堆）
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            ShiftDown(arr,arr.length,i);
        }
        //大堆建成后，拿堆顶元素和最后一个元素交换，然后最后一个元素出堆，再向下调整堆
        int heapsize=arr.length; //一开始堆的大小就为数组的大小
        for(int i=0;i<arr.length;i++){
            //交换第一个堆顶元素和最后一个元素
            int temp=arr[0];
            arr[0]=arr[heapsize-1];
            arr[heapsize-1]=temp;
           //最后一个元素要出堆
            heapsize--;
            //向下调整堆
            ShiftDown(arr,heapsize,0);

        }

    }
    public static void ShiftDown(int[] arr,int size,int index){
        int parent=index;
        int child=2*parent+1; //左孩子
        while (child<size){ //左孩子节点小于堆的大小即可入堆调整
            //选出左右孩子中大的一个
            if (child + 1 < size && arr[child] <arr[child+1]) {
                child=child+1;
            }
            //父节点的值小于孩子节点的值交换
            if(arr[parent]<arr[child]){
                int temp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=temp;
            }else {
                break;  //调整好了跳出循环
            }
            parent=child; //继续往下调整
            child=2*parent+1;
        }
    }
    public static void main(String[] args) {
        int[] arr={9,5,7,2,3,6,8};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        HeapSort(arr);
        System.out.println("堆排序排序后："+"==>"+"升序");
        System.out.println(Arrays.toString(arr));
    }
}
