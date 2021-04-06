public class Shusu {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;    //跳出内层循环
                }
            }
            if (j == i) {
                System.out.println(i + "");//打印素数
            }
        }
    }
}
