package javaSe0204;

import static javaSe0204.Test.*;
public class javaSe0217 {
    static int age;
    String name;

    @Override
    public String toString() {
        return name+"==>"+age;
    }
    public static   void eat(String name){
        System.out.println(name+"正在吃饭！");
    }

    public static void main(String[] args) {
        javaSe0217 p1=new javaSe0217();
        p1.name="琪琪";
        p1.age=10;
        javaSe0217.eat(p1.name);//通过类直接调用
        javaSe0217 p2=new javaSe0217();
        p2.name="哈哈";
        p2.age=20;
        p2.eat(p2.name);//通过对象调用
        print();
    }
}
