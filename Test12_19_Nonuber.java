import java.util.Scanner;
public class Test12_19_Nonuber {
    public static void main(String[] args) {
//        求一个整数，在内存当中存储时，二进制1的个数。
//          10000000 00000000 00000000 00000001
//     &    00000000 00000000 00000000 00000001
        int count=0;
        System.out.println("请输入一个整数；");
        Scanner Input=new Scanner(System.in);
        int number=Input.nextInt();
        for(int i=0;i<32;i++){
            if(((number >>i ) & 1 )==1){  //每一次与1做&与运算，如结果为1,则说明输入的这个整数的32个比特位上有个一
                count++;
            }
        }
        System.out.println("你输入整数中1的个数是："+count);
    }
}
