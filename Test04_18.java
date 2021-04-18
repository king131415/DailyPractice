package javaDailyProctice;

import java.io.*;

public class Test04_18 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        File file=new File("D:\\Daliy_DownLoad\\Down_Java_View\\【最新】深入理解Java虚拟机（jvm性能调优+内存模型+虚拟机原理）\\1.1.说在前面的话(Av83284652,P1).mp4");
        InputStream is=new FileInputStream("D:\\Daliy_DownLoad\\Down_Java_View\\【最新】深入理解Java虚拟机（jvm性能调优+内存模型+虚拟机原理）\\1.1.说在前面的话(Av83284652,P1).mp4");
        OutputStream os=new FileOutputStream("D:\\Daliy_DownLoad\\Down_Java_View\\AAA\\1.mp4");
        byte[] data=new byte[1024];
        long FileData=file.length();
        int length;
        long completed=0l;
        long cur=0;
        while ( (length= is.read(data))!=-1){
            completed+=1024;
            os.write(data,0,length);
            long progress=Math.round((double) completed/FileData*100) ;
            if(progress!=cur){
                System.out.println("已经完成了"+progress+"%");
            }
            cur=progress;

        }
        is.close();
        os.close();
        System.out.println("拷贝完成！！");
    }
}
