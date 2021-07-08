package javaDailyProctice.Test0708_ConrentHashmap;


import java.util.HashMap;

class Student{
    int id;
    int age;
    String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.age+this.id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Student s1=(Student)obj;
//        return this.name.equals(s1.name);
//    }
}



public class Test0708 {
    public static void main(String[] args) {
        Student s1=new Student(12,20,"哈哈");
        Student s2=new Student(20,18,"哈哈");
        Student s3=new Student(12,20,"哈哈");
        Student s4=new Student(12,20,"哈哈");
        Student s5=new Student(12,20,"哈哈");
        Student s6=new Student(12,20,"哈哈");
        Student s7=new Student(12,20,"哈哈");
        Student s8=new Student(12,20,"哈哈");
        Student s9=new Student(12,20,"哈哈");
        Student s10=new Student(12,20,"哈哈");
        Student s11=new Student(12,20,"哈哈");
        Student s12=new Student(12,20,"哈哈");
        Student s13=new Student(12,20,"哈哈");
        Student s14=new Student(12,20,"哈哈");
        Student s15=new Student(12,20,"哈哈");
        Student s16=new Student(12,20,"哈哈");
        Student s17=new Student(12,20,"哈哈");
        Student s18=new Student(12,20,"哈哈");
        Student s19=new Student(12,20,"哈哈");

        Student s20=new Student(12,20,"哈哈");
        Student s21=new Student(12,20,"哈哈");
        Student s22=new Student(12,20,"哈哈");
        Student s23=new Student(12,20,"哈哈");
        Student s24=new Student(12,20,"哈哈");
        Student s25=new Student(12,20,"哈哈");
        Student s26=new Student(12,20,"哈哈");
        Student s27=new Student(12,20,"哈哈");
        Student s28=new Student(12,20,"哈哈");
        Student s29=new Student(12,20,"哈哈");
        Student s30=new Student(12,20,"哈哈");
        Student s31=new Student(12,20,"哈哈");
        Student s32=new Student(12,20,"哈哈");

        HashMap<Student,Integer> map=new HashMap<>();
        map.put(s1,1);
        map.put(s2,2);
        map.put(s3,3);
        map.put(s4,4);
        map.put(s5,5);
        map.put(s6,6);
        map.put(s7,7);
        map.put(s8,8);
        map.put(s9,9);
        map.put(s10,10);
        map.put(s11,11);
        map.put(s12,12);
        map.put(s13,13);
        map.put(s14,14);
        map.put(s15,15);
        map.put(s16,16);
        map.put(s17,17);
        map.put(s18,18);
        map.put(s19,19);

        map.put(s20,20);
        map.put(s21,21);
        map.put(s22,22);
        map.put(s23,23);
        map.put(s24,24);
        map.put(s25,25);
        map.put(s26,26);
        map.put(s27,27);
        map.put(s28,28);
        map.put(s29,29);
        map.put(s30,30);
        map.put(s31,31);
        map.put(s32,32);



        System.out.println(map);

    }
}
