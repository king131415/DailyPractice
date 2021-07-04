package org.example.controller;

import org.Model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 组合注解的使用;@RestController ==>@Controller +@ResponseBody这两个注解加在类上
 */
@RestController
@RequestMapping("rest")
public class TestController2 {
    @GetMapping("/1")
    public Object test1(){
        Person p1=new Person("武松",20,'男');
        Person p2=new Person("武大郎",28,'男');
        Person[] people=new Person[2];
        people[0]=p1;
        people[1]=p2;
        return people;
    }

    @PostMapping("/2")
    public Object test2(){
        Person p1=new Person("武松",20,'男');
        return p1;
    }
}
