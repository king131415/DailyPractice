package org.Dao;

public class Person implements Comparable<Person>{
    private  String name;
    private   int age;

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Person p1= (Person) obj;
        if(p1.name.equals(this.name) && p1.age==this.age){
            return true;
        }
        return false;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
