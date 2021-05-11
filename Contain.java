package javaDailyProctice.Test0511;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//容器
public class Contain {
    public static void main(String[] args) throws IOException {
        //创建服务器程序
        ServerSocket server=new ServerSocket();
        //绑定端口号
        server.bind(new InetSocketAddress(8888));
        while (true){
            //端口开始监听
            Socket accept = server.accept();
            //获得输入流对象
            InputStream in = accept.getInputStream();
            StringBuilder sb=new StringBuilder();
            int len;
            byte[] buf=new byte[512];
            while ((len=in.read(buf))!=-1){
                sb.append(new String(buf,0,len));
                if(len<512){
                    accept.shutdownOutput();
                }
            }
            //构建一个请求对象
           Request reqest=Request.buildRequest(sb.toString());
            String url = reqest.getUrl();
            Servlet servlet = Test01.SERVLET_CONTAINER.get(url);
            servlet.service();//调用自己写的服务方法


        }


    }
}
