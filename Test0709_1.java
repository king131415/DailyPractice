package javaDailyProctice.Test0709;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Test0709_1 {
    public static void main(String[] args) {
//        Hashtable map=new Hashtable();
////        map.put("",1);
////        HashSet
////        HashMap map=new HashMap();
////                map.put("","");
        ConcurrentHashMap<Integer,Integer> map1 =new ConcurrentHashMap();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<60000;i++){
                    map1.put(i,i+1);
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=60000;i<100000;i++){
                    map1.put(i,i+1);
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=100000;i<120000;i++){
                    map1.put(i,i+1);
                }
            }
        });
        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=120000;i<180000;i++){
                    map1.put(i,i+1);
                }
            }
        });
        Thread t5=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<180000;i++){
                    System.out.println(map1.get(i));
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
