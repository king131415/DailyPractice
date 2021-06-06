package javaDailyProctice.Test0606;

import java.util.Comparator;
import java.util.PriorityQueue;

class girl {
    String name;
    int age;
    int money;
    int face;

    public girl(String name, int age, int money, int face) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.face = face;
    }

    @Override
    public String toString() {
        return "girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", face=" + face +
                '}';
    }
}

class compareTest implements Comparator<girl>{

    @Override
    public int compare(girl o1, girl o2) { //性价比复合比较规则

        return (o2.face*6+o2.money*2+o2.age*2) -(o1.face*6+o2.age*2+o2.money*2);
    }
}


public class Test0606_1 {
    public static void main(String[] args) {
    girl[] girls={
            new girl("静静",18,15,100),
            new girl("甜甜",25,200,50),
            new girl("富婆",40,150,5)
    };
    PriorityQueue<girl> queue=new PriorityQueue<>(new compareTest());
        for (girl g:girls){
                queue.offer(g);
                }
        System.out.println("性价比最高的女朋友排序:");
                while (!queue.isEmpty()){
                girl g= queue.poll();
                System.out.println(g);
                }
    }
}


