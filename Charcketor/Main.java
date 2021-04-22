package javaDailyProctice.Charcketor;

/**
 * 练习适配器模式
 */
public class Main {
    public static void main(String[] args) {
        Muble m1=new Muble();
        V v=new Adator();
        V v1=new Adator1();
        m1.outputChar(v1);
        //这里要研究一下
        int i=0;
        Integer b=new Integer(0);
        System.out.println(i==b);
        System.out.println(b.equals(i));
        ((Main)null).testMothed();
    }
    public static void testMothed(){
        System.out.println("11111");
    }
}


