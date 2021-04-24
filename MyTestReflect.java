package javaDailyProctice.Reflact;

import java.lang.reflect.Field;

/**
 * 测试反射
 */
public class MyTestReflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Student> stu = Student.class;
        Student student1 = stu.newInstance();
        Field name =stu.getDeclaredField("name");
        name.setAccessible(true);
        name.set(student1,"哈哈");
//        Student student=new Student();
//        student.eat();
        student1.eat();

//        Class<Poeple> M1= Poeple.class;
//        Poeple poeple = M1.newInstance();
//        Field name1 = M1.getDeclaredField("name");
//        name1.setAccessible(true);
//        name1.set(poeple,"哈哈");
////        Poeple p1=new Poeple();
////        p1.eat();
//        poeple.eat();
    }
}


class Student extends Poeple{
//    public Student(String name) {
//        super(name);
//    }
}

class Poeple{
    String name;
//
//    public Poeple(String name) {
//        this.name = name;
//    }

    void eat(){
        System.out.println(name+"吃东西");
    }
}
