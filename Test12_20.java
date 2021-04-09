import java.util.Scanner;
public class Test12_20 {
    public static void main(String[] args) {
//        求1！+2！+3！+4！+........+n!的和
        System.out.println("请您输入想要求的数的阶乘之总和：");
        Scanner Input=new Scanner(System.in);
        int num= Input.nextInt();
        jieChen(num);
    }
    public static void jieChen(int num) {
        int result=0;
        int tempResult=1;
        for(int i=1;i<=num;i++){
            tempResult*=i;
            result+=tempResult;
        }
        System.out.println("阶乘之和为："+result);
    }
}

