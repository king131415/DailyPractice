package javaDailyProctice.Test0718;




public class Test0718_1 {
    private  volatile int a=0;
    public static void main(String[] args) throws InterruptedException {
        Test0718_1 m=new Test0718_1();

        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000000;i++){
                    m.a++;
                }
            }
        });
        Thread r2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000000;i++){
                    System.out.println(m.a);
                }
            }
        });
        t.start();
        r2.start();
        t.join();
        //观察结果发现线程不安全，结果不符合预期
//        System.out.println(m.a);

    }
}
