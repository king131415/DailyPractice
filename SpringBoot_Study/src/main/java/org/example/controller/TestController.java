package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * 加上@Controller;保证能被扫描到后;装配到容器中去
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/1")
    public String toDoUrl() {
        return "redirect:/index.html";
    }

    /**
     * @return
     * @RequestMapping结合@ResponseBody，返回的字符串会作为响应体内容。此时响应的 Content-Type为 text/plain 普通文本。
     */
    @RequestMapping("/2")
    @ResponseBody
    public String test1() {
        return "hello world!";
    }

    /**
     * 返回类型为Object，一般使用带Getter，Setter方法的模型类
     * 结合@ResponseBody使用，表示将对象序列化后的数据放在响应体返回
     * 在SpringBoot中默认响应的Content-Type为 application/json
     * 非字符串对象会自动序列化为 json 字符串
     *
     * @return
     */
    @RequestMapping("/3")
    @ResponseBody
    public Object test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "武松");
        map.put(2, "hello");
        map.put(3, "武大郎");
        return map;

    }

    /**
     * 返回ResponseEntity;和上面test2返回的数据是一样的
     * 使用SpringMVC框架中提供的ResponseEntity，
     * 可以灵活的设置响应状态码，响应头，响应体
     */
    @RequestMapping("/5")
    public Object test3() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "武松");
        map.put(2, "hello");
        map.put(3, "武大郎");
        return ResponseEntity.status(200).body(map);
    }
}
