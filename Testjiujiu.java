import java.util.Scanner;
public class Testjiujiu {
    public static void main(String[] args) {
//        输出n*n的乘法口诀表，n由用户输入。
        int i;
        System.out.println("请输入你要打印的行数：");
        Scanner Input=new Scanner(System.in);
        int num=Input.nextInt();
        for(i=1;i<=num;i++){     //总共要打印的行数
            curculate(i);
        }
    }
    public static void curculate(int i) {
        int j;
        for(j=1;j<=i;j++){
            System.out.print(j+"X"+i+"="+j*i+" "); //循环打印每行
        }
        System.out.println();
    }
}