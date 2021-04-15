package javaDailyProctice;

import java.io.File;
import java.util.Scanner;

public class Test0415 {
    public static void main(String[] args) {
//        Random  random=new Random();
//        int a=random.nextInt(100);
//        System.out.println(a);
//        String str="hello";
//        String str1="he"+new String("llo");
//        System.out.println(str==str1);
//            String panth="D:/";
//            File file =new File("D:\\Program Files (x86)");
//            PrintFile(file, 0);
//        Scanner scanner=new Scanner(System.in);
//        int a,b;
//        String str=
//        StringBuffer sf=new StringBuffer("");
//        while (scanner.hasNext()){
//            a=scanner.nextInt();
//            b=scanner.nextInt();
//            sf.append(a%b);
//            for(int i=a/b;i!=0;){
//                int j=i/b;
//                i=j;
//                sf.append(i%b);
//            }
//            sf.reverse();
//        }
//        int result=Integer.parseInt(sf.toString());
//
//
//    }
//    public static void PrintFile(File file,int iLevel) {
//        for (int i = 0; i < iLevel; i++) {
//            System.out.print("-");
//        }
//        System.out.println(file.getName());
//
//        if (file.isDirectory()) {
//            File[] arrFiles = file.listFiles();        //子目录
//            for (File fileItem : arrFiles) {
//                if(fileItem!=null){
//                    PrintFile(fileItem, iLevel + 1);
//                }
//
//            }
//        }
//    }
        Scanner scanner=new Scanner(System.in);
        int M,N;
        while (scanner.hasNext()){
            M=scanner.nextInt();
            N=scanner.nextInt();
            String str=solve(M,N);
            System.out.println(Integer.parseInt(str));

        }


    }
    public  static  String solve (int M, int N) {
        if(M == 0) return "0";
        boolean flag = true;
        if(M < 0){
            M = - M;
            flag = false;
        }
        StringBuffer res = new StringBuffer();
        String hex = "0123456789ABCDEF";
        while(M != 0){
            res.append(hex.charAt(M % N));
            M = M / N;
        }
        return flag == true ? res.reverse().toString() : "-"+res.reverse().toString();
    }
}

