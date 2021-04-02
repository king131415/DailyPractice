public class 二分查找 {
    public static void main(String[] args) {
       int[] arr={12,2,4,15,46,22};
       int pos=findsort(arr,15);
        System.out.println("你查找元素的下标是："+pos);
    }

    public static int findsort(int[] arr, int i) {
        int left=0;
        int reght=arr.length-1;
        while (left<=reght) {
            int mid=(left+reght)/2;
            if (arr[mid] > i) {
                reght = reght - 1;
            } else if (arr[mid] < i) {
                left = left + 1;
            } else {
                return mid;
            }
        }
        return -1;//没有这个数
    }
}
