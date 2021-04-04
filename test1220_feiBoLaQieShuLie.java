import java.util.Scanner;
public class test1220_feiBoLaQieShuLie {
    public static void main(String[] args) {
//        求斐波那契数列的第n项。(迭代实现)
        System.out.println("请输入你要求的第几项：");
        Scanner Input=new Scanner(System.in);
        int num=Input.nextInt();
        FeiboLaQie(num);
    }
    public static void FeiboLaQie(int num) {
        int i=1;
        if(num<=1){
            System.out.println(1);
        }else{
            int[] arr=new int[num+1];
            arr[0]=0;
            arr[1]=1;
            for(i=2;i<=num;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
            System.out.println(arr[num]);
        }



    }
}
