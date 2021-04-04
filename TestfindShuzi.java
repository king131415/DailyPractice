public class TestfindShuzi {
//    有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
  public static void main(String[] args) {
    int arr[]={1,8,8,7,7,4,4,3,3};
    finder(arr);
  }
    private static void finder(int[] arr) {
     int i;
     int num=0;
     for(i=0;i<arr.length;i++){
        num^=arr[i];//进行异或运算后，就留下了数组只出现了一次的数
     }
        System.out.println("这个数是："+num);
    }
}
