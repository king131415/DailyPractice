package StudentSystem.Operations;

import StudentSystem.Students;

import java.util.Scanner;

public class ShowIoperation implements Iopertion {
    //显示学生的个人信息
    @Override
    public void work(Students students) {
        System.out.println("请输入你要查询学生的姓名:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int i=0;
        for (;i<students.getSize();i++){
            if(students.getstudent(i).getName().equals(name)){
                System.out.println("你要查询的学生信息如下：");
                System.out.println(students.getstudent(i));
            }
        }

        if(i==students.getSize()){
            System.out.println("没有该学生的信息！");
            return;
        }
    }
}
