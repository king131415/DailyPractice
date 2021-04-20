package javaDailyProctice;

/**
 * 枚举学习
 */
public class MeiJuTest {
    public static void main(String[] args) {
        Corlor c1=Corlor.Red;
          test(c1);
    }

    public static void test(Corlor c1) {
        switch (c1){
            case Red:
                System.out.println("这是红色");
                break;
            case GREEN:
                System.out.println("这是绿色");
                break;
            case BLUE:
                System.out.println("这是蓝色");
                break;
            default:
                System.out.println("wuse");
        }
    }
}
