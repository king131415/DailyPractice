package StudentSystem.Operations;

import StudentSystem.Students;

import java.util.Scanner;

public class DeleteOperation implements Iopertion {
    //删除学生信息
    @Override
    public void work(Students students) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要删除学生的姓名:");
        String name=scanner.nextLine();
        int i=0;
        for (;i<students.getSize();i++){
            if(students.getstudent(i).getName().equals(name)){
                students.setStudents(i,students.getstudent(students.getSize()-1));
                students.setSize(students.getSize()-1);
                System.out.println("学生信息删除成功！");
                break;
            }
        }
        if(i==students.getSize()){
            System.out.println("没有此学生的信息！");
            return;
        }
    }
}
