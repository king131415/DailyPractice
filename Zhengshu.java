import java.util.Scanner;
public class Zhengshu {
    public static void main(String[] args) {
//       输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
      Scanner Input=new Scanner(System.in);
      System.out.println("请输入一个数：");
      int num=Input.nextInt();
      print(num);
    }
    public static void print(int i){
          if(i>9){
            print(i/10);//利用递归
        }
        System.out.print(i%10+"，"+" ");
    }
}
