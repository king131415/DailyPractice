package Tread_Study;

public class Test0529_1 {
    public static void main(String[] args) throws InterruptedException {
        long starTime= System.nanoTime();
        count();
        count();
        long endTime = System.nanoTime();
        System.out.println("串行执行的时间"+(endTime-starTime)/1000/1000+"ms");


        long starTime2= System.nanoTime();
       new Thread(new Runnable() {
           @Override
           public void run() {
               count();
           }
       }).start();
        count();
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        long endTime2= System.nanoTime();
        System.out.println("并行执行的时间"+(endTime2-starTime2)/1000/1000+"ms");




    }
    public static  void count(){
        long count=0;
        for(long i=0;i<200_0000_0000l;i++){
            count++;
        }
    }
}
