package javaDailyProctice.Test0713_Socket;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test0713_2 {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(9999);
        while (true){
            Socket accept = server.accept();
            InputStream is = accept.getInputStream();
//            byte[] data=new byte[1024];
//            int len;
            while (true){
//                String result=new String(data,0,len);
//                System.out.println(result);
                int a=is.read();
                if(a==-1){
                    break;
                }
                String result=new String(String.valueOf(a));
                System.out.println(result);
            }
            is.close();

        }
    }
}
