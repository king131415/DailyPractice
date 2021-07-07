package javaDailyProctice.Test0706_HashMap;


import java.util.HashMap;
import java.util.Map;

class PerSon{
    int age;
    String name;
    int face;

    public PerSon(int age, String name, int face) {
        this.age = age;
        this.name = name;
        this.face = face;
    }

    @Override
    public String toString() {
        return "PerSon{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", face=" + face +
                '}';
    }

    @Override
    public int hashCode() {
        return (this.age+this.face);
    }

    @Override
    public boolean equals(Object obj) {
        PerSon perSon=(PerSon) obj;
        return this.name.equals(((PerSon) obj).name);
    }
}






public class Test_HashMap_7_7 {
    public static void main(String[] args) {

        Map<PerSon,Integer> map=new HashMap<>();
        PerSon p1=new PerSon(20,"邱琦",70);
        PerSon p2=new PerSon(20,"sdf",60);
        PerSon p3=new PerSon(20,"邱琦sfd",30);
        PerSon p4=new PerSon(20,"wegwe",40);
        PerSon p5=new PerSon(20,"凯撒给",73);
        PerSon p6=new PerSon(20,"邱琦",70);
        map.put(p1,1);
        map.put(p6,7);
        map.put(p2,2);
        map.put(p3,3);
        map.put(p4,4);
        map.put(p5,5);

        System.out.println(map);
//        System.out.println(map.get(p1));
//        System.out.println(map.get(p6));



    }
}
