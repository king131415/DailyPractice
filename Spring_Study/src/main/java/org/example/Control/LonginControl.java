package org.example.Control;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class LonginControl {
   //方法注解，当该类能被扫描到时，可以使用该注解装配Bean对象

    /**
     * 当前类能被spring扫描到的情况下；
     * 方法上@bean注解可以装配Bean
     * 方法名作为Bean的名称/Id,返回值对象作为Bean对象
     *
     */
    @Bean
    public Temp temp(){
        return new Temp(); //会把new出来的Temp对象装配到容器中，
    }

  public  static class  Temp{

    }

}

