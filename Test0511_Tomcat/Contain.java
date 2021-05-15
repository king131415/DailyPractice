package javaDailyProctice.Test0511_Tomcat;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

//模拟Tomcat的核心组件之一的连接器用来处理socket连接，和网络字节流req,resp对象的转化/Catalina
public class Contain {
    static {
        try {
            Test01.WEB_CONFIG.load(Contain.class.getClassLoader().getResourceAsStream("web.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Test01.SERVLET_CONTAINER.put("/index",new IndexServlet()); //添加一个服务方法

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //创建服务器程序
        ServerSocket server=new ServerSocket();
        //绑定端口号
        server.bind(new InetSocketAddress(7777));
        while (true){
            //端口开始监听
            Socket accept = server.accept();
            //获得输入流对象
            InputStream in = accept.getInputStream();
            StringBuilder sb=new StringBuilder();
            int len;
            byte[] buf=new byte[512];
            while ((len=in.read(buf))!=-1){
                //获得浏览器的Http请求并且转化为字符串
                sb.append(new String(buf,0,len));
                if(len<512){
                    accept.shutdownInput();
                }
            }
            //构建一个请求对象
            Request reqest=Request.buildRequest(sb.toString()); //根据浏览器输入的请求构建一个请求
            String url = reqest.getUrl(); //拿到浏览器发起请求的URl


            if("/favicon.ico".equals(url)){ //去掉无关的请求
                continue;
            }
            Servlet servlet = Test01.SERVLET_CONTAINER.get(url); //根据URL去服务器容器里面去哪对应的请求
            if(servlet==null) {
                //如果容器里面没有
                String fullClassNme = Test01.WEB_CONFIG.getProperty(url);
                if (!"".equals(fullClassNme) && fullClassNme != null) {
                    //创建一个servlet，并且放入容器中
                    servlet = (Servlet) Class.forName(fullClassNme).newInstance();//通过反射创建对象

                } else {

                    servlet = new IndexServlet();

                }
            }

                 //构造一个响应
                Response response=new Response();
                response.setOs(accept.getOutputStream());


             if(reqest.getHeaders().get("cookie")==null || !reqest.getHeaders().get("cookie").contains("jseesionId")){

                 String jseesionId = UUID.randomUUID().toString();
                 Test01.SESSIONS.put(jseesionId,new HashMap<>());
                 response.addHeader("set-cookie","jseesionId="+jseesionId);
             }


                //将servlet加入到容器中
             Test01.SERVLET_CONTAINER.put(url,servlet);

             servlet.service(reqest,response);//调用自己写的服务方法

        }


    }
}





















