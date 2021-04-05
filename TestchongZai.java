public class TestchongZai {
     public static void main(String[] args) {
//         调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
         int[] arr={11,2,3,4,5,6};
         int i;
         int j;
         int temp;
         System.out.println("排序前：");
         for(int d=0;d<6;d++){
             System.out.print(arr[d]+" ");
         }
         System.out.println();
         for(i=0,j=5;i<j;i++,j--){
             if(arr[i] % 2 == 0){
                if(arr[j]%2!=0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
             }
         }
         System.out.println("排序后：");
         for(int k=0;k<6;k++){
             System.out.print(arr[k]+" ");
         }
    }
}

