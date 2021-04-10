package StudentSystem;

import StudentSystem.Operations.*;

import java.util.Scanner;

public class Admi extends Users {
    public Admi(String name) {
        this.name=name;
        this.iopertions=new Iopertion[]{
                new Addoperation(),
                new DeleteOperation(),
                new dispOperation(),
                new ShowIoperation(),
                new UpdateOperation(),
                new ExistOperation()
        };

    }

    @Override
    public int menu() {
        System.out.println("你好！"+name+"欢迎来到图书管理系统！    ");
        System.out.println("==================================");
        System.out.println("          1.添加学生信息             ");
        System.out.println("          2.删除学生信息             ");
        System.out.println("          3.查看学生信息列表          ");
        System.out.println("          4.查找学生信息             ");
        System.out.println("          5.修改学生信息             ");
        System.out.println("          6.退出系统                ");
        System.out.println("==================================");
        Scanner scanner =new Scanner(System.in);
        int chioce=scanner.nextInt();
        return chioce;

    }
}
