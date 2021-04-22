package javaDailyProctice.ChongZai;
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Bird extends Animal{

    public Bird(String name) {
        super(name);
        System.out.println(name);
    }
}

public class MainTest {
    public static void main(String[] args) {
        Animal animal=new Bird("圆圆");
    }
}
