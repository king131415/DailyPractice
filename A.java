package javaHomeWork;

public class A {
    public static void main(String[] args) {
        String str="Hello";
        String str1=new String("Hel"+"lo");//相当于new String("Hello")
        System.out.println(str==str1);
    }
}
