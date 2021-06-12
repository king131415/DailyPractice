package javaDailyProctice.Test0612_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3
 * 7 4 7 ==> 4  7  7
 * 2 50
 */
public class Test0612_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int tip=sc.nextInt();
            int d=sc.nextInt();
            Arrays.sort(arr);
            if(tip<=arr.length && tip>=1) {
                int temp=0;
                int result=1;
                for (int i = arr.length - 1; i >= 0; i--) {
                    if(temp==tip){
                        break;
                    }
                    result*=arr[i];
                    temp++;
                }
                System.out.println(result);
            }
        }
        sc.close();
    }
}
