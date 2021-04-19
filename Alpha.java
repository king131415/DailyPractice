package javaHomeWork;


class Base {

    Base() {

        System.out.print("Base");

    }

}

public class Alpha extends Base {

    public static void main( String[] args ) {
        new Alpha();

        Base a=new Base();
        //调用父类无参的构造方法



    }

}