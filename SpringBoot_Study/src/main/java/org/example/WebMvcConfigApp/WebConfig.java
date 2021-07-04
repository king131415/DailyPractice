package org.example.WebMvcConfigApp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig  implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //Controller路径，统一添加请求的路径前缀，第二个参数，c是Controller类，返回boolean表示
        //是否添加前缀
        //所有Controller请求路径，都要带/api的前缀
        configurer.addPathPrefix("api", c->true);


    }
}
