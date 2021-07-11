package javaDailyProctice.Test0711_Leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 连续最大和
 * 一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
 *
 * 3
 * -1 2 1
 *
 *
 * 输入为两行。 第一行一个整数n(1 <= n <= 100000)，表示一共有n个元素 第二行为n个数，
 * 即每个元素,每个整数都在32位int范围内。以空格分隔。
 *
 */
public class Test0711_2 {
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
