package javaDailyProctice.Test0511;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//Tomcat的核心组件之一/servlet容器
public class Test01 {
    public  final static Properties WEB_CONFIG =new Properties();
    //Servlet容器
    public final  static Map< String,Servlet> SERVLET_CONTAINER=new HashMap(8);
    //Session容器
    public final  static Map< String,Map<String,Object>> SESSIONS=new HashMap(8);

}
