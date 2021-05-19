package javaDailyProctice.Test0519;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solusion {
    public static  String merg(int a,int b,int c){
        if((a+b)>c && (a+c)>b && (b+c)>a){
            return "Yes";
        }else {
            return "NO";
        }
    }





    public static String acd(long a,long b){
            if(2*b*3.14>a){
                return "Yes";
            }else {
                return "NO";
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        while (sc.hasNext()){
            long a=sc.nextLong();
            long b=sc.nextLong();
            String result=acd(a,b);
            list.add(result);
        }
        for(String s:list){
            System.out.println(s);
        }
    }
}
