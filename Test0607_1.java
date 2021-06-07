package javaDailyProctice.Test0607;

//死锁
class Pen {
    private String pen = "笔" ;
    public String getPen() {
        return pen;
    }
}
class Book {
    private String book = "本" ;
    public String getBook() {
        return book;
    }
}
public class Test0607_1 {
    private static Pen pen = new Pen();
    private static Book book = new Book();

    public static void main(String[] args) {
        new Test0607_1().deadLock();
    }

    public void deadLock() {
        Thread thread1 = new Thread(new Runnable() { // 笔线程
            @Override
            public void run() {
                synchronized (pen) {
                    System.out.println(Thread.currentThread() + " :我有笔，我就不给 你");
                    synchronized (book) {
                        System.out.println(Thread.currentThread() + " :把你的本给 我！");
                    }
                }
            }
        }, "Pen");

        Thread thread2 = new Thread(new Runnable() { // 本子线程
            @Override
            public void run() {
                synchronized (book) {
                    System.out.println(Thread.currentThread() + " :我有本子，我就不给 你！");
                    synchronized (pen) {
                        System.out.println(Thread.currentThread() + " :把你的笔给我！");
                    }
                }

            }
        }, "Book");
        thread1.start();
        thread2.start();
    }
}
