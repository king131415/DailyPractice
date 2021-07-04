package org.example.controller;

import org.Model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;




@RestController
@RequestMapping
public class TestController3 {

    //实现动态URL
    @RequestMapping("/user/{id}")
    public  Object user(@PathVariable Integer id){
        Map<String,Object> map=new HashMap<>();
        map.put("username","张三");
        return  map;

    }

    /**
     * @RequestParam(required = false) ;如果参数注解中的属性required=false,表示传入的参数可以不填
     * @param username
     * @param passworld
     * @return
     */
    @RequestMapping("/9")
    public  Object testResqustParam(@RequestParam(required = false) String username,@RequestParam String passworld){
        Map<String,Object> map=new HashMap<>();
        map.put("username","张三");
        System.out.println(username + " " +passworld);
        return map;
    }
    @RequestMapping("/10")
    public Object param3(@RequestParam MultipartFile head) throws IOException {
        InputStream is=new FileInputStream("file");
        OutputStream os=new FileOutputStream("D://AAA");
        byte[] date=new byte[1024];
        while ((is.read(date))!=-1){
            os.write(date);

        }
        os.flush();
        os.close();
        is.close();
        Map<String, String> map = new HashMap<>();
        map.put("文件名", head.getName()+", "+head.getOriginalFilename());
        map.put("文件类型", head.getContentType());
        map.put("文件大小", head.getSize()/1024+"KB");
        map.put("文件内容（二进制转字符串）", new String(head.getBytes()));
        return map;


    }
    @PostMapping("/aa")
    public Object pojo2(User user){
        Map<String, String> map = new HashMap<>();
        map.put("用户名", user.getUsername());
        map.put("密码", user.getPassword());
        return map;
    }



}
