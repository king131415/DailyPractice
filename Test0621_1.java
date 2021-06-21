package javaDailyProctice.Test0621;

public class Test0621_1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        }).start();
        System.out.println(2);
    }
}
