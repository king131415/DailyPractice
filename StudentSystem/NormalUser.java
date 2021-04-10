package StudentSystem;

import StudentSystem.Operations.ExistOperation;
import StudentSystem.Operations.Iopertion;
import StudentSystem.Operations.ShowIoperation;
import StudentSystem.Operations.UpdateOperation;

import java.util.Scanner;

public class NormalUser  extends Users{
    public NormalUser(String name) {
        this.name=name;

        this.iopertions=new Iopertion[]{
                new ShowIoperation(),
                new UpdateOperation(),
                new ExistOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("你好！"+name+"欢迎来到图书管理系统！");
        System.out.println("===============================");
        System.out.println("          1.查看学生个人信息       ");
        System.out.println("          2.修改学生个人信息       ");
        System.out.println("          3.退出系统             ");
        System.out.println("================================");
        Scanner scanner=new Scanner(System.in);
        int chioce=scanner.nextInt();
        return chioce;
    }
}
