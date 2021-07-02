package org.example.Service;

import lombok.Getter;
import org.example.Control.LonginControl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
public class LoginService {
    @Autowired
    private LonginControl.Temp temp;

    /**
     * 构造方法注入
     * @param temp
     */
    @Autowired
    public LoginService(LonginControl.Temp temp) {
        this.temp=temp;
    }
}
