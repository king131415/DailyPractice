package javaDailyProctice.Mysort;

import java.util.Arrays;

public class Test0613_5 {

    public static void QuickSort(int[] arr){

        _QuickSort(arr,0,arr.length-1);
    }
    public static void _QuickSort(int[] arr,int left, int right){
        if(left>=right){
            return;
        }
        int index=partition(arr,left,right);
        //递归左边快排
        _QuickSort(arr,left,index-1);
        //递归右边快排
        _QuickSort(arr,index+1,right);
    }

    public static int partition(int[] arr,int left,int right){
        int l=left;
        int r=right;
        int var=arr[right]; //基准元素
        while (l<r){
            //若选取右边元素作为基准值，就先从左边出发。
            //从左边出发寻找一个比基准值大的元素
            while (l<r && arr[l]<=var){
                l++;
            }
            //从右边出发选择一个比基准值小的元素
            while (l<r && arr[r]>=var){
                r--;
            }
            //从左边和右边找到合适的元素后，进行交换
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

        }
        //循环结束后，将基准值和左右指针相交处交换
        int temp=arr[l];
        arr[l]=arr[right];
        arr[right]=temp;
        return l; //返回左右指针相交点
    }
    public static void main(String[] args) {
        int[] arr={9,5,7,2,3,6,8};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        QuickSort(arr);
        System.out.println("快速排序排序后："+"==>"+"升序");
        System.out.println(Arrays.toString(arr));
    }
}
