package StudentSystem.Operations;

import StudentSystem.Students;
import StudentSystem.student;

import java.util.Scanner;

public class Addoperation implements Iopertion{
    //添加学生信息
    @Override
    public void work(Students students) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生的姓名:");
        String name=scanner.next();
        System.out.println("请输入学生的学号:");
        int id=scanner.nextInt();
        System.out.println("请输入学生的性别:");
        String sex=scanner.next();
        System.out.println("请输入学生的年龄:");
        int age=scanner.nextInt();
        System.out.println("请输入学生的分数:");
        int score=scanner.nextInt();
        student  newStudent=new student(id,name,sex,age,score);
        students.setStudents(students.getSize(),newStudent);
        students.setSize(students.getSize()+1);
        System.out.println("添加学生信息成功！");

    }
}
