package javaDailyProctice.Test0708_ConrentHashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test0708_1 {
    public static void main(String[] args) throws InterruptedException {
//        Map<Integer,Integer> map=new Hashtable<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<100;i++){
            map.put(i,i+1);
            map.get(i);
        }
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<20;i++){
                    map.get(i);
                }
            }
        });
        t.start();
        t.join();

    }
}
