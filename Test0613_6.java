package javaDailyProctice.Mysort;

import java.util.Arrays;
import java.util.Stack;

public class Test0613_6 {
    public static void QuickSortByloop(int[] arr){
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        stack.push(arr.length-1);
        while (!stack.isEmpty()){
            int right=stack.pop();
            int left=stack.pop();
           if(left>=right){
               continue; //空区间或一个一个元素，就不要排序
           }
           int index=partition(arr,left,right);
            // 右侧区间: [index + 1, right]
            stack.push(index + 1);
            stack.push(right);
            // 左侧区间: [left, index - 1]
            stack.push(left);
            stack.push(index - 1);

        }

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
        QuickSortByloop(arr);
        System.out.println("快速排序排序后："+"==>"+"升序");
        System.out.println(Arrays.toString(arr));
    }
}
