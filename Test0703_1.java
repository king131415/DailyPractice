package org.Dao;

public class Test0703_1 {
    public static void main(String[] args) {
        Person p1=new Person("哈哈",20);
        Person p2=new Person("哈哈",20);
        int a=10;
        int b=10;
        String str1="11";
        String str2=new String("11");
        if(str1==str2){
            System.out.println(true);
        }
        System.out.println(str1==str2);
        System.out.println(a==b);
        System.out.println(p1==p2);
    }
}
