package javaDailyProctice;

public class 成员内部类 {
    public static void main(String[] args) {
//        Mysub mysub=new Mysub(new Outer());
//        mysub.test();
//        Mysub mysub=new Mysub(new Outer());
//        mysub.test();


    }
}

class Outer{
    class Inner{
        public  void test(){
            System.out.println("你好！");
        }
    }
}

class CCtalk{
    void view(){
        System.out.println("nihao");
    }
}


class Mysub extends Outer.Inner {
    //因为是继承关系，调用子类的构造方法之前会调用父类的构造方法
//  又因为是内部类，需要用到外部类的实例，所以要给他一个对象
    public Mysub(Outer outer) {
        outer.super();  //调用Inner类的构造方法
    }

}