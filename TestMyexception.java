package javaSeWork;

import java.util.Scanner;
class Myexception extends RuntimeException{  //自定义一个异常类
    public Myexception(String message) {
        super(message);
    }
}
public class TestMyexception {
    /**
     * 实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码.
     * 如果用户名密码出错, 使用自定义异常的方式来处理
     */
    public static void main(String[] args) throws Myexception {
        Scanner scanner = new Scanner(System.in);
        String pwd = scanner.next();
        Mytest(pwd);

    }
    public static void Mytest(String pwd) throws Myexception {
        if ("123456".equals(pwd) == false) {
                throw new Myexception("密码错误！");//抛出一个自定义异常
            } else {
            System.out.println("登录成功！");
        }
    }
}

