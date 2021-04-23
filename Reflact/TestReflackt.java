package javaDailyProctice.Reflact;

import java.lang.reflect.Field;

//什么叫反射
public class TestReflackt {
    public static void main(String[] args) throws Exception {
        //通过Animal这个类对象，就可以操作Animal这个类
        //
        Class<Animal> ani= Animal.class;
        String name = ani.getName();
        System.out.println(name); //拿到类名

        String str="hello";
        Class<String> SS = String.class;
        Field file1 = SS.getDeclaredField(str);
        file1.setAccessible(true);
        char[] syr1 = (char[]) file1.get(str);
        syr1[0]='m';
        System.out.println(str);
    }
}


class Animal{
    String name;
    public void eat(){
        System.out.println("吃东西！！！");
    }
}
