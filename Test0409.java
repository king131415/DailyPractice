package javaDailyProctice;

public class Test0409 {
    public static void main(String[] args) {
        //自动装箱
        Integer a=12;  //实际会隐式调用 Integer.valueOf()方法
        System.out.println(a);
        Integer b=new Integer(30);
        //自动拆箱
        int num=b;   //实际会隐式调用b.intvalueOf()方法
        System.out.println(b);
    }
}
