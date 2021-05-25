package Test0525_2;

import java.util.Arrays;

class Peson implements Comparable<Peson> {
    String name;
    int age;

    public Peson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Peson o) {
        //要利用Intager类重写好的CompareTo来排序
        return new Integer(age).compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Peson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Test0525 {
    public static void main(String[] args) {
        Peson[] p={new Peson("达摩",20),
                   new Peson("三藏",25),
                   new Peson("宫本",22)};
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }

}
