package javaDailyProctice.UDPTongXin.UdpTalck;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;



public class UdpServer2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(6666);

//       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        while (true){

         byte[] data=new byte[1024];

         DatagramPacket packet=new DatagramPacket(data,0,data.length);
         socket.receive(packet);
         String msg=new String(packet.getData(),0,packet.getData().length);
            System.out.println(msg);
            if(msg.trim().equals("bye")){
                break;
            }

        }
              socket.close();
    }
}
