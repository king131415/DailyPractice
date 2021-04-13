package javaDailyProctice;

import java.util.*;

class Person implements Comparable<Person>{
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
       return this.age-o.age;
    }
}



public class Test0410 {
    public static void main(String[] args) {
        Person p1=new Person("邱琦",60,"男");
        Person p2=new Person("哈斯奇",3,"男");
        Person p3=new Person("泰迪",10,"男");
        Person p4=new Person("土狗",22,"男");
        Person p5=new Person("小狗",1,"男");
//        Set<Person> set=new HashSet<>();
        List<Person> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        Collections.sort(list);
        for(Person person:list){
            System.out.println(person);
        }
        
    }
}
