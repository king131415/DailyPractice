package javaDailyProctice;


import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class QQserver {
    public static void main(String[] args) throws Exception {
        //创建一个服务器
        ServerSocket server = new ServerSocket();
        //服务器绑定一个端口号
        server.bind(new InetSocketAddress(8888));  //括号里面需要什么就New什么
        //端口号开始接受
        System.out.println("监听在8888端口！！");
        Socket accept = server.accept();

        InputStream inputStream = accept.getInputStream();
        byte[] data=new byte[1024];
        int len;
        while ((len= inputStream.read(data))!=-1){
            System.out.println(new java.lang.String(data,0,len));
        }

        inputStream.close();

    }
}
