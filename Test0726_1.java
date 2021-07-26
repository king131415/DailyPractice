package javaDailyProctice.Test0724;


import java.util.ArrayList;
import java.util.List;

class A{
    protected int a=10;
    public A() {
        System.out.println("A");
        eat();
    }
    private  void eat(){
        System.out.println(a);

    }
}

/**
 * 幸运数字判断问题  ===>多益网络
 */

public class Test0724_1 extends A {
    public static  void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int a=19;
        while (a!=1){
            while (a!=0){
                list.add(a%10);
                a=a/10;
            }
            System.out.println(list.toString());
            Object[] objects = list.toArray();
            for(int i=0;i<objects.length;i++){
                a+=(Integer.parseInt(objects[i].toString()) * Integer.parseInt(objects[i].toString()));
            }
            list.clear(); //清空原来集合中的数据
        }
        System.out.println(true);
    }
}
