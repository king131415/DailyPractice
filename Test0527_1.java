package Test0527;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test0527_1 {  //static修饰的方法不能重写
    //插入排序     1  2  3  0  5  6
    // 如果数组相对有序，排序的效率是很高的;稳定排序
    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j]; //不满足升序,元素往后搬运
                }else {
                    break; //待排序区间的第一个元素比已排序区间最后一个元素大，跳出本次循环
                }
            }
            arr[j+1]=temp;
        }

    }
    //希尔排序,本质就是加强版的插入排序;不稳定排序,因为要分组
    public static void ShellSort(int[] arr){
        int gap=arr.length/2;  //定义分组下标
        while (gap>=1){
            _shellSort(arr,gap);
            gap=gap/2;
        }
    }

    public static void _shellSort(int[] arr, int gap) {
        for(int i=gap;i<arr.length;i++){
            int temp=arr[i];  //拿出待排序区间的第一个数，和已排序区间比较
            int j=i-gap;
            for(;j>=0;j-=gap){
                if(arr[j]>temp){
                    arr[j+gap]=arr[j];  //进行元素搬运
                }else {
                    break;
                }
            }
            arr[j+gap]=temp;
        }
    }
    //选择排序 //9,5,2,7,3,6,8
    public static void SelectSort(int[] arr){
        for(int i=0;i<arr.length;i++){  //从头开始遍历数组
            for (int j=i+1;j<arr.length;j++){  //拿数组的第一个元素和后面的进行比较，完成后得到的最小值就是已排序区间
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    //堆排序
    public static void heapSort(int[] arr){
        // 1. 先建立堆!!
        createHeap(arr);
        // 2. 需要循环的取出堆顶元素, 和最后一个元素交换并删除之
        //    再从 0 位置进行调整
        int heapSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            // 交换 0 号元素和堆的最后一个元素
//            swap(arr, 0, heapSize - 1);
            int temp=arr[0];
            arr[0]=arr[heapSize-1];
            arr[heapSize-1]=temp;
            // 把最后一个元素从堆上删除
            heapSize--;
            // 从 0 号位置开始往下进行调整
            shiftDown(arr, heapSize, 0);
        }


    }

    private static void shiftDown(int[] arr, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            // 先找出左右子树比较大的~
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            // 再去比较 child 和 parent
            if (arr[parent] < arr[child]) {
//                swap(arr, parent, child);
                int temp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=temp;
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void createHeap(int[] arr) {
        for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(arr, arr.length, i);
        }
    }

    //快速排序
    public static void QuickSort(int[] arr){
        //辅助递归方法
        _quickSort(arr, 0, arr.length - 1);
    }

    public static void _quickSort(int[] arr, int left, int right) {
        if(left>=right){
            return;
        }
        // 现针对当前 [left, right] 区间进行 partition 操作
        // 方法的返回值, 表示整理完当前区间后, 基准值所在的位置.
        // 遍历过程中的 left 和 right 的重合位置
        int index=partion(arr,left,right);
        // 递归的对左侧区间进行快速排序
        _quickSort(arr,left,index-1);
        // 递归的对右侧区间进行快速排序
        _quickSort(arr,index+1,right);

    }

    private static int partion(int[] arr, int left, int right) {
        // 选取最右侧元素作为基准值.
        int v = arr[right];
        int l = left;
        int r = right;
        // 如果 l 和 r 重合, 说明遍历完成
        while (l < r) {
            // 先从左往右, 找一个比基准值大的数字.
            while (l < r && arr[l] <= v) {
                l++;
            }
            // 当循环结束的时候, l 就指向了比基准值大的元素
            // 再从右往左, 找一个比基准值小的数字
            while (l < r && arr[r] >= v) {
                r--;
            }
//            swap(arr, l, r);
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        // 当 l 和 r 重合的时候, 就把重合位置的元素和基准值位置进行交换
//        swap(arr, l, right);
        int temp=arr[l];
        arr[l]=arr[right];
        arr[right]=temp;
        // 最终方法返回基准值所在的位置(l 和 r 重合的位置)
        return l;
    }

    //
//    public void fun(List< String> list) {  //这样写不可以有相同的泛型擦除
//        list.add("d");
//
//    }
//
    public void fun(List<Integer> list){
        list.add(1);
        System.out.println(list.get(0));

    }


    public static void main(String[] args) {
//        Test0527_1 t=new Test0527_1();
//        t.fun(new ArrayList<>());
           int[] arr={9,5,2,7,3,6,8};
//////        insertSort(arr);
////        ShellSort(arr);
//        ShellSort(arr);
//        QuickSort(arr);
        heapSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
