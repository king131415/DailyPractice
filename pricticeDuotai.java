package javaDailyProctice;

class A{
    public String show(A obj){
        return ("A and A");
    }
}
class B extends A{
    public String show(B obj){
        return ("B and B");
    }
    public String show(A obj){
        return ("B and A");
    }
}

/**
 * 多态练习题
 */
public class pricticeDuotai {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new B();
        B b=new B();
        System.out.println(a2.show(b));
    }
}
