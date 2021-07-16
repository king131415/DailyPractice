package javaDailyProctice.Test0716_MeiJu;

/**
 * 枚举学习
 */
public class MeiJuTest0716_1 {
    public static void main(String[] args) {
        Corlor_0716_2 c1= Corlor_0716_2.Red;
          test(c1);
    }

    public static void test(Corlor_0716_2 c1) {
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
