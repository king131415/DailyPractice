import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4,8,9,7,6};
        System.out.println("排序前：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }
        System.out.println();
        System.out.println("排序后：");
        maipao(arr);// 自定义的冒泡排序
        System.out.println("java标准库排序法:");
        Arrays.sort(arr);  // JAVA标准库的排序算法
        System.out.println(Arrays.toString(arr));
    }
    public static void maipao(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){  //优化后的冒泡排序
            for(int j=0;j<arr.length-1-i;j++){
               if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }
        System.out.println();
    }
}
