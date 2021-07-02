package org.example;

import org.example.Control.LonginControl;
import org.example.Service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //根据Spring配置文件路径创建容器：应用上下文对象
        //启动容器：加载XMl配置文件，扫描指定包下(org.example)带有Spring注解的类，
        // 都会被装配到Spring容器中，装配到容器中的对象称为Bean对象
        //容器可以看成是一个Map结构;key为Beanid;值为：Bean对象
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        //通过类型来获取Bean对象(方式一）
        LonginControl bean = context.getBean(LonginControl.class);
        System.out.println(bean);

        //通过Bean的名称或Id获取Bean对象(方式二）
        LonginControl longinControl = (LonginControl) context.getBean("longinControl");
        System.out.println(longinControl);

//        LonginControl.Temp bean1 = context.getBean(LonginControl.Temp.class);
//        System.out.println(bean1);

       //方法名作为BeanId
        LonginControl.Temp bean2 = (LonginControl.Temp) context.getBean("temp");
        System.out.println(bean2);

        LonginControl.Temp temp = (LonginControl.Temp) context.getBean("tempFactory");
        System.out.println(temp);


        LoginService loginService = (LoginService) context.getBean("loginService");
        System.out.println(loginService.getTemp());

        LoginService bean1 = context.getBean(LoginService.class);
        System.out.println(bean1.getTemp());

        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }

}
