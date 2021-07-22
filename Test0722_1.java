package javaDailyProctice.Test0722;

public class Test0722_1 {
    public static void bublle(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
       int[] arr={1,3,4,7,9};
       bublle(arr);

    }
}
