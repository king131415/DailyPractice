package javaDailyProctice.Test0709;

import java.util.Hashtable;

public class MyConcurrentHashMap<K,V> {
    private   Hashtable<K,V>[] Segments;

    public MyConcurrentHashMap() {
        Segments=new Hashtable[16]; //默认的初始容量大小
    }

    private int hashcode(K key){
        return key.hashCode()%Segments.length;
    }

    public void  put(K key, V value){
        //通过计算，把数据放到对应的Segments数组对应的下标的
        int index=hashcode(key);
        //取出对应的Segment对象
        Hashtable<K,V> curtable=Segments[index];
        //如果为空就创建一个
        if(curtable==null){
            curtable=new Hashtable<>();
        }
        curtable.put(key,value);
        Segments[index]=curtable;
    }

    public V get(K key){
        int index=hashcode(key);

        Hashtable<K,V> curtable=Segments[index];
        if(curtable!=null){
            return curtable.get(key);
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        MyConcurrentHashMap<Integer,Integer> map=new MyConcurrentHashMap<>();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<60000;i++){
                    map.put(i,i+1);
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=60000;i<100000;i++){
                    map.put(i,i+1);
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=100000;i<120000;i++){
                    map.put(i,i+1);
                }
            }
        });
        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=120000;i<180000;i++){
                    map.put(i,i+1);
                }
            }
        });
        Thread t5=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<180000;i++){
                    System.out.println(map.get(i));
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
