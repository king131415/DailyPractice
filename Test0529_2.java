package Tread_Study;

public class Test0529_2 {
    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {
                System.out.println("hah");
            }
        };
//        t.start();
//        t.run();
        System.out.println("好的");
    }
}

