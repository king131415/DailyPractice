package javaDailyProctice.Test0721;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test0721_1 {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Scanner scanner=new Scanner(System.in);
        while (true){
            Socket accept = server.accept();
            InputStream in = accept.getInputStream();
            OutputStream os = accept.getOutputStream();
            int len;
            while ((len=in.read())!=-1){
                System.out.println((char) len);
            }
            os.write(scanner.next().getBytes());
        }
    }
}
