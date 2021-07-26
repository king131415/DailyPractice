package javaDailyProctice.Test0724;

import java.io.File;
import java.util.Arrays;

public class Test0724_2 {
    public static void SelectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String rootPath="D:\\Daliy_DownLoad\\Java_Kuang_Jar\\JVM\\";
        File file=new File("D:\\Daliy_DownLoad\\Java_Kuang_Jar\\JVM");
        boolean exists = file.exists();
        System.out.println(exists);
        boolean file1 = file.isFile();
        boolean directory = file.isDirectory();
        System.out.println(file1);
        System.out.println(directory);

        System.out.println("黑马程序员JVM完整教程，全网超高评价，全程干货不拖沓 - ".length());

        String[] list = file.list();
        for(String s:list){
            System.out.println(s);
        }
        for(int i=0;i<list.length;i++){ //29
            File file2=new File(rootPath+list[i]);
            file2.renameTo(new File(rootPath+""+list[i].substring(29,list[i].length())));
        }
        System.out.println("成功了");

//        file.renameTo(new File("D:\\AAA\\dd\\myHtml.txt"));
//        int [] arr={12,5,6,1,3,7,9,8};
//        SelectSort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println('z'-'a');

    }
}
