package javaDailyProctice.Test0710;

import javaDailyProctice.Test0708_ConrentHashmap.Test0708_1;

import java.util.HashMap;

public class Test0710_1 {
    private HashMap map=new HashMap();

    public Test0710_1() throws InterruptedException {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    map.put(new Integer(i), i);
                }
                System.out.println("t1 over");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 5000; i < 10000; i++) {
                    map.put(new Integer(i), i);
                }

                System.out.println("t2 over");
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                for (int i = 10000; i < 15000; i++) {
                    map.put(new Integer(i), i);
                }

                System.out.println("t3 over");
            }
        };

        Thread t4 = new Thread() {
            public void run() {
                for (int i = 15000; i < 20000; i++) {
                    map.put(new Integer(i), i);
                }

                System.out.println("t4 over");
            }

        };
        Thread t5= new Thread() {
            public void run() {
                for (int i = 0; i < 20000; i++) {
                    System.out.println(map.get(i));
                }

                System.out.println("t5 over");
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(1000);
        t5.start();


    }

    public static void main(String[] args) throws InterruptedException {
        new Test0710_1();
    }
}
