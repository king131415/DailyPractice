package javaDailyProctice.UDPTongXin.UdpTalck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServer1 {
    public static void main(String[] args) throws IOException {
        //建立socket连接
        DatagramSocket socket=new DatagramSocket(5555);
        //准备从控制台读取数据
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String data=reader.readLine();
            byte[] bytes = data.getBytes();
            //要发送的端口好
            int port=6666;
            InetAddress localhost = InetAddress.getByName("localhost");

            DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length,localhost,port);
            socket.send(packet);
            if(data.equals("bye")){
                break;
            }
        }
        socket.close();
        reader.close();
    }
}
