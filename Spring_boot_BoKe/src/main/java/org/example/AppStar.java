package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动类
 */
@SpringBootApplication
public class AppStar {
    public static void main(String[] args) {
       // 注意第一个参数是当前类的类对象
        SpringApplication.run(AppStar.class, args);
    }
}
