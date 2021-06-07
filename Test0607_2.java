package javaDailyProctice.Test0607;

public class Test0607_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
        t.start();
        t.join(); //调用该方法时的主线程会阻塞等待
        System.out.println(2);


    }
}
