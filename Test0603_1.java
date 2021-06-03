package javaDailyProctice.Test0603;

public class Test0603_1 {
    
    
    
    public static void main(String[] args) {
        int[] arr={1,4,5,7,3,8};
        insertsort(arr);
    }

    public static void insertsort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j]; //不满足升序,元素往后搬运
                }else {
                    break; //待排序区间的第一个元素比已排序区间最后一个元素大，跳出本次循环
                }
            }
            arr[j+1]=temp;
        }
    }
}
