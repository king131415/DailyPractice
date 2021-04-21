package javaDailyProctice;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class QQTest {
    public static void main(String[] args)  throws Exception{
        //1.创建一个客户端,可以使用有参构造方法连接到相应的主机跟端口号
        Socket socket = new Socket("192.168.43.39",8888);
        //2.使用无参构造方法后，需要调用connect方法连接到相应的主机和端口号
//        socket.connect(new InetSocketAddress("192.168.43.39",8888));
        //创建流对象
        OutputStream outputStream = socket.getOutputStream();

        String msg="hello";

        outputStream.write(msg.getBytes());

        outputStream.flush();
        outputStream.close();

    }
}
