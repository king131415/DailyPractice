package javaDailyProctice.Test0710;

public class Test0710_2 {
    private static volatile int count;
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    count+=i;
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    count+=i;
                }
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(count);

    }
}
