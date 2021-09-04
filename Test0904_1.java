
import java.util.Arrays;
import java.util.Scanner;

public class Test0904_1 {
    //快递问题  ===》便利蜂题目
    // 数组A   1  2   3  4  1  5 ，经过几次调整 能变成不重复的序列 ，每一次调整就加一
    // 首先排序  1  1  2  3  4  5         3
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String[] s = sc.next().split(",");
            int[] arr=new int[s.length];
            for(int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(arr);
            int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length-1;j++){
                    if(arr[j]==arr[j+1]){
                        arr[j]+=1;
                        count++;
                    }
                }
                Arrays.sort(arr);
            }
            System.out.println(count);
        }
    }
}
