package javaDailyProctice.Test0614;

import java.util.Arrays;

public class Test0614_6 {
    public static void mergeSort(int[] arr){
          _mergeSort(arr,0,arr.length);

    }
    public static void _mergeSort(int[] arr, int left, int right) {
        if(right-left<=1){ //区间长度为1了就不需要再切分了
            return;
        }
        int mid=(left+right)/2;
        //左边区间变成有序
        _mergeSort(arr,left,mid);
        //右边区间变成有序
        _mergeSort(arr,mid,right);
        //合并左右区间
        merge(arr,left,mid,right);
    }

    public static void merge(int[] arr,int left,int mid,int right){
        if(left>=right){
            return; //空的区间不需要合并
        }
        int[] temp=new int[right-left];
        int indextep=0;
        int cur1=left;
        int cur2=mid;
        while (cur1<mid && cur2<right){
            if(arr[cur1]<=arr[cur2]){
                temp[indextep]=arr[cur1];
                indextep++;
                cur1++;
            }else {
                temp[indextep]=arr[cur2];
                indextep++;
                cur2++;
            }
        }
        //左边区间有剩余，直接拷贝去零时数组
        while (cur1<mid){
            temp[indextep]=arr[cur1];
            indextep++;
            cur1++;
        }
        //若右边区间有剩余，则拷贝去数组
        while (cur2<right){
            temp[indextep]=arr[cur2];
            indextep++;
            cur2++;
        }
        //拷贝回原来的数组
        for(int i=0;i<temp.length;i++){
            arr[left+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={9,5,7,2,3,6,8};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        System.out.println("归并排序排序后："+"==>"+"升序");
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
