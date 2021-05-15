package javaDailyProctice.Test0511_Tomcat;

import java.util.Map;

public class HomeServlet implements Servlet {

    public HomeServlet(){
        init();
    }


    @Override
    public void init() {
        System.out.println("初始！");

    }

    @Override
    public void service(Request request, Response response) {
//        System.out.println("this is home");
//        response.write("<h1>home</h1>");
        String cookis = request.getHeaders().get("cookie");
        if(cookis==null){
            System.out.println("请您登录！");
            response.write("<h1>请您登录！！</h1>");
        } else {
            //第二次请求来的话cookie就不为空了
            String SessionId= cookis.split("=")[1];
            Map<String, Object> seesion = Test01.SESSIONS.get(SessionId);
            if( seesion==null ||seesion.get("user")==null){
                response.write("<h1>请您登录！！</h1>");
            }else {
                //通过会话中村的键值对，可以拿到相应的姓名
                response.write("<h1>你好！"+seesion.get("user")+"</h1>");
            }
        }
    }

    @Override
    public void destory() {

    }
}
