package javaDailyProctice.Test0511_Tomcat;

import java.util.Map;

public class IndexServlet implements Servlet {


    public IndexServlet() {
        init();
    }

    @Override
    public void init() {
        System.out.println("初始化！");
    }

    @Override
    public void service(Request request, Response response) {
//        System.out.println("这是首页！");
//        response.write("<h1>hello</h1>");
        String cookis = request.getHeaders().get("cookie");
        //第一次请求来，cookie为空
        if(cookis==null){
            response.write("<h1>请您登录！！</h1>");
        } else {
            //第二次请求来的cookie不为空，通过这个cookie从session中拿到相应的对象，然年做相关的数据存贮
            String SessionId= cookis.split("=")[1];
            Map<String, Object> seesion = Test01.SESSIONS.get(SessionId);
            //拿到会话对象后，给会话对象设置值
            seesion.put("user","zhangsan");
            response.write("<h1>登录成功！</h1>");
        }

    }

    @Override
    public void destory() {

    }
}
