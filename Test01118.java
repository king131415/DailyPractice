import java.util.Arrays;
public class Test01118 {
    public static void main(String[] args) {

// 给定一个数组 nums 和一个值 val ，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
// 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成

// 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它
//将会被按顺序插入的位置,你可以假设数组中无重复元素
//        int[] arr={1,2,3,4,5,6};
//        int pos=Sort(arr,8);
//        System.out.println("目标元素的位置是："+pos);
//    }
//    public static int Sort(int[] arr, int i) {
//        int left=0;
//        int right=arr.length-1;
//        if(i<arr[0]){
//            return 0;
//        }else if(i>arr[arr.length-1]){
//            return arr.length;
//        }else{
//            while (left<=right){  //利用折半查找来查找元素
//                int mid=(left+right)/2;
//                if(arr[mid]>i){
//                    right-=1;
//                }else if(arr[mid]<i){
//                    left+=1;
//                }else{
//                    return mid;
//                }
//            }
//        }
//        return -1; //返回一个非法的标记

//        给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
//        int[] arr={1,2,3,4,5,6};
//        System.out.println("变化前的数组：");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("变化后的数组：");
//        sortJiOu(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//        public static void sortJiOu ( int[] arr){
//            for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
//                int temp = 0;
//                if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }

//        给定两个整型数组, 交换两个数组的内容
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        System.out.println("交换前："+"arr1==>"+Arrays.toString(arr1)+"arr2==>" +Arrays.toString(arr2));
        swap(arr1,arr2);
        System.out.println("交换后："+"arr1==>"+Arrays.toString(arr1)+"arr2==>"+ Arrays.toString(arr2));
    }
    public static void swap(int[] arr1, int[] arr2) {
        int temp=0;
        for(int i=0;i<arr1.length;i++){
            temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
    }
}
