package javaDailyProctice;

import org.junit.Test;

import java.io.*;

public class Test0416 {
    /**
     * 打印指定路径下的所有文件和结构
     * @param args
     */
    public static void main(String[] args) {

//        String path = "D:\\";
//        File file = new File(path);
//        func(file);
//
//
//        File file=new File("D:\\giteeCode");
//        PrintFile(file,0);


//        File file=new File("D:\\AAA");
//        File file1=new File("D:\\AAA");
//        //常用方法
//        System.out.println("文件是否可读"+file.canRead());
//        System.out.println("文件是否可写"+file.canWrite());
//        System.out.println("文件的名字"+file.getName());
//        System.out.println("文件的上级目录"+file.getParent());
//        System.out.println("文件是否是一个目录"+file.isDirectory());
//        System.out.println("文件是否是一个文件"+file.isFile());
//        System.out.println("文件是否隐藏"+file.isHidden());
//        System.out.println("文件的大小"+file.length());
//        System.out.println(file==file1); //这里是比较对象的地址
//        System.out.println(file.equals(file1)); //这里是比较两个对象对应文件的路径

//        //跟目录相关的方法
//        File f1=new File("D:\\a");
//        //创建目录
//        f1.mkdir();
//        //创建多级目录
//        File f2=new File("D:\\a\\b\\c");
//        f2.mkdirs();
//        //删除目录
//        f2.delete();
//        //查看目录
// //       String[] list=f1.list();
//        File[] files=f2.listFiles();


        //文件拷贝！！！！
        InputStream in=null;
        OutputStream os=null;
        try {
             in=new FileInputStream("D:\\AAA\\BB\\DD.txt");
             os=new FileOutputStream("D:\\AAA\\CCC\\DD.txt");
             byte[] data=new byte[1024];
             int lenth;  //给读取的数据搞个小标，每次读取都往下表后填充
             while ((lenth=in.read(data))!=-1){
                 os.write(data,0,lenth);
             }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream ou=null;

    }

    public static void PrintFile(File file,int iLevel) {
        for (int i = 0; i < iLevel; i++) {
            System.out.print("-");
        }
        if(file.isFile()){
            System.out.println(file.getName()); //获取文件名
        }
        if (file.isDirectory()) {    //是否是一个目录
            File[] arrFiles = file.listFiles();//子目录
            if (arrFiles != null) {
                for (File fileItem : arrFiles) {
                    if (fileItem != null) {
                        PrintFile(fileItem, iLevel + 1);
                    }
                }
            }
        }
    }
    @Test
    public void  ReadFiles() throws IOException {
        //首先建立流对象输入流
        InputStream is=new FileInputStream("D:\\AAA\\CCC\\DD.txt");
        //然后定义每次读取数据的大小
        byte[] data=new byte[1024];
        //定义一个下标
        int lenth;
        while ((lenth=is.read(data))!=-1){
            //从小标为0开始到小标为流读取的长度
            String result=new String(data,0,lenth);
            System.out.println(result);

        }
        is.close();
    }
    @Test
    public void ReadLiu() throws IOException {
        //创建字符流对象
        Reader reader=new FileReader("D:\\AAA\\CCC\\DD.txt");
        char[] data=new char[1024];
        int lenth;
        while ((lenth= reader.read(data))!=-1){
            String result=new String(data,0,lenth);
            System.out.println(result);
        }
        reader.close();
    }
    @Test
    public void HandleLiu(){
        //处理流
    }


}
