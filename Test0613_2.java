package javaDailyProctice.Mysort;

import java.util.Arrays;

public class Test0613_2 {
    public static void ShellSort(int[] arr){
        int gap=arr.length/2;
        while (gap>=1) {  //分组系数，直到1为止就成插入排序了
            int bound = gap;  //从分组系数位置出发
            for (; bound < arr.length; bound++) { //控制插排的次数
                int temp = arr[bound];
                int cur = bound - gap;
                for (; cur >= 0; cur -= gap) { //控制每次插排元素要放到的位置
                    if (arr[cur] > temp) {
                        arr[cur + gap] = arr[cur]; //不符合排序要求，元素往后移动
                    } else {
                        break; //找到合适的位置了
                    }
                }
                arr[cur + gap] = temp; //内层循环，每次插排元素要放的位置
            }
            gap=gap/2; //分组系数每次除2，直到为1
        }
    }
    public static void main(String[] args) {
        int[] arr={9,5,7,2,3,6,8};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        ShellSort(arr);
        System.out.println("希尔排序后："+"==>"+"升序");
        System.out.println(Arrays.toString(arr));
    }
}
