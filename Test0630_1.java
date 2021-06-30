package javaDailyProctice.Test0630_1;

public class Test0630_1 {
    interface MyCompareble<T>{
        int compareto(T o);
    }


    class person implements MyCompareble<person>{
        int age;
        int face;
        int money;

        public person(int age, int face, int money) {
            this.age = age;
            this.face = face;
            this.money = money;
        }


        @Override
        public int compareto(person o) {
            return this.age-o.age; 
        }
    }

    public static void main(String[] args) {
      Test0630_1.person p1=new Test0630_1().new person(10,20,30);
        System.out.println(p1.age);
    }
}
