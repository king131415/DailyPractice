package Tread_Study;


//匿名内部类的学习
public class Test0529 {
    public static void main(String[] args) {
       A a=new A(){  //new了一个不带名字的类继承了A类
           @Override
           public void run() {
               System.out.println("哈哈");
           }
       };
       a.run();

    }
    public static class A{
        public void run(){
            System.out.println("nn");
        }
    }
}
