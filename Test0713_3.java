package javaDailyProctice.Test0713_Socket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test0713_3 {
    public static void main(String[] args) throws IOException {
        FileInputStream is=new FileInputStream("D:\\AAA\\BB\\DD.txt");
//        FileOutputStream os=new FileOutputStream("D:\\AAA\\BB\\A.txt");
        String result = null;
        StringBuilder builder=new StringBuilder();
        while (true){
            byte[] data=new byte[256];
            int a=is.read(data);
            if(a==-1){
                break;
            }
             result=new String(data,0,a);
             builder.append(result);


        }
        System.out.println(builder.toString());
//        os.flush();
//        os.close();
        is.close();
    }
}
