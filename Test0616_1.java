package javaDailyProctice.Test0616;

public class Test0616_1 {
    protected int x=10;

    public Test0616_1() {
        System.out.println(x);
        change();
        System.out.println(x);
    }
    public void change(){
        x=3;
    }
}
class b extends Test0616_1{
    protected  int b=1;
    @Override
    public void change() {
        x=9;
    }

    public static void main(String[] args) {
        b b1=new b();
        System.out.println(b1.x);
    }
}
