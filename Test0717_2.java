package javaDailyProctice.Test0717_Tomcat_HTTP;

import java.util.Arrays;
import java.util.Scanner;

public class Test0717_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a=sc.nextInt();
            int[] arr=new int[a];
            int mixsum=0;//从零开始累加
            int maxsum=-1;//取出最小值
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                mixsum+=arr[i];
                if(mixsum>maxsum){
                    maxsum=mixsum; //缓存最大值
                }
                if(mixsum<0){ //说明比原来值小了，重新开始计算
                    mixsum=0;
                }
            }
            if(maxsum==-1){
                Arrays.sort(arr);
                System.out.println(arr[arr.length-1]);
            }else{
                System.out.println(maxsum);
            }
        }

    }
}
