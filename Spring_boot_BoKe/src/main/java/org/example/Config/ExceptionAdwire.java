package org.example.Config;


import lombok.extern.slf4j.Slf4j;
import org.ResponsData.ResponsUtil;
import org.example.Exception.Appexception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;

/**
 * 统一的异常处理
 * 统一封装为响应的格式
 */

@ControllerAdvice
@Slf4j
public class ExceptionAdwire {
    @ExceptionHandler(Appexception.class)
    @ResponseBody
    public Object handleAppException(Appexception e){
        log.debug("自定义异常",e);
        ResponsUtil json=new ResponsUtil();
        json.setMassge(e.getMessage());
        return json;

    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(Exception e){
        log.error("系统出错",e);
        ResponsUtil json=new ResponsUtil();
        json.setMassge("系统出错了,练习管理员");
        return json;

    }

}
