package javaDailyProctice.Test0708_ConrentHashmap;
import java.util.HashMap;
public class Test0708_2 {

    private HashMap map = new HashMap();

    public Test0708_2() {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }
                System.out.println("t1 over");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }

                System.out.println("t2 over");
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }

                System.out.println("t3 over");
            }
        };

        Thread t4 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), i);
                }

                System.out.println("t4 over");
            }

        };
        Thread t5= new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    System.out.println(map.get(i));
                }

                System.out.println("t5 over");
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }

    public static void main(String[] args) {
        new Test0708_2();
    }
}