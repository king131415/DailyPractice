package javaDailyProctice.Test0614;

import java.util.Arrays;

public class Test0614_7 {
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
    public static void mergeSortByloop(int[] arr){
        int gap=1;
        for(;gap<arr.length;gap*=2){
            for(int i=0;i<arr.length;i+=2*gap){
                int left = i;  //  0
                int mid = i + gap;   //  2
                if (mid >= arr.length) {
                    mid = arr.length;
                }
                int right = i + 2 * gap;  // 4
                if (right >= arr.length) {
                    right = arr.length;
                }
                merge(arr, left, mid, right);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={9,5,7,2,3,6,8};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        System.out.println("归并排序排序后："+"==>"+"升序");
        mergeSortByloop(arr);
        System.out.println(Arrays.toString(arr));
    }
}
