package Test0525;

class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal() {

    }

    public void eat(){
        System.out.println("吃吃吃，大吃货！");
    }
}


public class Test0525_1 {
    //<T>可以理解位泛型方法的标志，T就是返回值
    public  static <T> T myprint(Class<T> c) throws IllegalAccessException, InstantiationException {

        return c.newInstance(); //本质调用无参构造器，实例化对象

    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Animal a1 = myprint(Animal.class);
        a1.eat();

    }
}
