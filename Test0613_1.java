package javaDailyProctice.Mysort;

import java.util.Arrays;

public class Test0613_1 {
    //9,5,7,2,3,6,8
    public static void insertSort(int[]  arr){
        int bound=1; //待插入元素的下标
        for(;bound<arr.length;bound++){ //控制插入排序的次数
            int temp=arr[bound]; //把待插入的值放到临时变量中
            int cur=bound-1;
            for(;cur>=0;cur--){ //循环比较，插入合适的位置
                if(arr[cur]>temp){
                    arr[cur+1]=arr[cur]; //不符合升序，元素往后移
                }else {
                    break; //找到合适位置了，跳出整个循环
                }
            }
            arr[cur+1]=temp;//循环完后，待插入的元素要放到合适的位置
        }

    }
    public static void main(String[] args) {
        int[] arr={9,5,7,2,3,6,8};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println("插入排序后："+"==>"+"升序");
        System.out.println(Arrays.toString(arr));
    }
}
