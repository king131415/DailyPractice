package javaDailyProctice.Test0603;

public class Test0603_2 {
    public static void main(String[] args) {
        int[] arr={5,2,1,7,8,6};
        ShellSort1(arr);
    }


    public static void ShellSort1(int[] arr){
        int gap=arr.length/2;  //定义分组下标
        while (gap>=1){
            _ShellSort1(arr,gap);
            gap=gap/2;
        }
    }
    public static void _ShellSort1(int[] arr,int gap) {
        for(int i=gap;i<arr.length;i++){
            int temp=arr[i];  //拿出待排序区间的第一个数，和已排序区间比较
            int j=i-gap;
            for(;j>=0;j-=gap){
                if(arr[j]>temp){
                    arr[j+gap]=arr[j];  //进行元素搬运
                }else {
                    break;
                }
            }
            arr[j+gap]=temp;
        }
    }
}
