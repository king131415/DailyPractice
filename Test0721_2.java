package javaDailyProctice.Test0721;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Test0721_2 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket();
        Scanner scanner=new Scanner(System.in);
        socket.bind(new InetSocketAddress(8888));
        OutputStream os = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        while (true){
            os.write(scanner.next().getBytes());
            byte[] data=new byte[1024];
            int len;
            while ((len=in.read())!=-1){
                String s=new String(data,0,len);
                System.out.println(s);
                if(s.equals("bye")){
                    socket.shutdownInput();
                    socket.shutdownOutput();
                    socket.close();
                }
            }

        }

    }
}
