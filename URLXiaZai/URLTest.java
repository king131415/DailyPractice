package javaDailyProctice.URLXiaZai;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLTest {
    public static void main(String[] args) throws Exception {
        //下载地址
        URL url = new URL("https://m801.music.126.net/20210420185624/33a11da86a706fcba5ffacad88d7f5a7/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/7966962407/9e22/f58a/d67e/b1bbb96f4a6e10d2c589e12033e3db30.m4a");
        //连接到这个资源
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
       //通过流来连接对象
        InputStream inputStream= urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream("m.m4a");
        byte[] buffer = new byte[1024];
        int len;
        while ((len=inputStream.read(buffer))!=-1){
            fos.write(buffer,0, len);//写出数据
        }
        fos.close();
        inputStream.close();
        urlConnection.disconnect();
    }
}
