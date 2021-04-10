package StudentSystem;

import MyBookSystem.Admin;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Students students=new Students(); //初始化学生列表
        Users users=login(); //向上转型
        while (true){
            int chioce=users.menu();
            users.doIoperation(students ,chioce);

        }
    }

    private static Users login() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name=scanner.nextLine();
        System.out.println("请输入您的角色： 1.管理员   2.学生");
        int chioce=scanner.nextInt();
        if(chioce==1){
            return new Admi(name);
        }else if(chioce==2){
            return new NormalUser(name);
        }else {
            System.out.println("您输入的有误");
            System.exit(0);
        }
        return null;

    }
}
