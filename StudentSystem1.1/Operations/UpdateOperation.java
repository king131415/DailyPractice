package StudentSystem.Operations;

import StudentSystem.Students;

import java.util.Scanner;

public class UpdateOperation  implements Iopertion{
    //修改学生信息
    @Override
    public void work(Students students) {
         Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要修改学生的姓名:");
            String name = scanner.nextLine();
            int i = 0;
            for (; i < students.getSize(); i++) {
                if (students.getstudent(i).getName().equals(name)) {
                    System.out.println("请您将修改学生的学号，年龄，分数的值为:");
                    int id = scanner.nextInt();
                    int age = scanner.nextInt();
                    int score = scanner.nextInt();
                    students.getstudent(i).setId(id);
                    students.getstudent(i).setAge(age);
                    students.getstudent(i).setScore(score);
                    System.out.println("学生信息修改成功！");
                    return;
                }
            }
            if (i == students.getSize()) {
                System.out.println("没有该学生信息，无需修改");
                return;
            }
    }
}
