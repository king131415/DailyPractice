import java.util.Scanner;
public class Koujue {
    public static void main(String[] args) {
//        输出n*n的乘法口诀表，n由用户输入。

        int i,j;
        System.out.println("请输入你要打印的行数：");
        Scanner Input=new Scanner(System.in);
         int num=Input.nextInt();
         for(i=1;i<=num;i++){
             for(j=1;j<=i;j++){
                 System.out.print(i+"*"+j+"="+i*j+"  ");
             }
             System.out.println();
         }
    }
}
