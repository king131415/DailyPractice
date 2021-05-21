package javaDailyProctice.Test0521;

public class Test0521 {
    //[1,2,3,4] ==>[2,1,4,3]
    public void oddInOddEvenInEven(int[] arr) {
        if(arr==null || arr.length<2){
            return;
        }
        int even=0;
        int odd=1;
        int end=arr.length-1;
        while(even <=end && odd<=end){
            if(arr[end]%2==0){
                swap(arr,end,even);
                even += 2;
            }else{
                swap(arr,end,odd);
                odd += 2;
            }
        }
    }
    public void swap(int[]array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
         Test0521 tset0521=new Test0521();
         int[] arr={2,4,3,5};
         tset0521.oddInOddEvenInEven(arr);
    }
}
