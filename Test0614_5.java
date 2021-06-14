package javaDailyProctice.Test0614;

public class Test0614_5 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap1(a,b);
        System.out.printf("%d %d",a,b);
    }

    private static void swap1(int a, int b) {
        int temp=a;
         a=b;
         b=temp;
         person p1=new person("p1");
         person p2=new person("p2");
         swap2(p1,p2);
        System.out.println(p1.name +" "+p2.name);

    }

    private static void swap2(person p1, person p2) {
//        person temp=p1;
//        p1=p2;
//        p2=temp;
        p1.name="p2";
        p2.name="p1";
    }

    static class person{
        String name;

        public person(String name) {
            this.name = name;
        }
    }

}

