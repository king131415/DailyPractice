
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class 内部类的初始化方式 {
    interface MyCompareble<T>{
        int CompareTo(T o);
    }

    class Man implements MyCompareble<Man>{
        int age;
        int face;
        int money;

        public Man(int age, int face, int money) {
            this.age = age;
            this.face = face;
            this.money = money;
        }


        @Override
        public int CompareTo(Man o) {
            return this.face-o.face;
        }

    }

   static class GirlFrend implements MyCompareble<GirlFrend> {
       int age;
       int face;
       int money;

       public GirlFrend(int age, int face, int money) {
           this.age = age;
           this.face = face;
           this.money = money;
       }

       @Override
       public int CompareTo(GirlFrend o) {
           return (this.age + this.face + this.money) - (o.face + o.money + o.age);
       }
   }

      public static void main(String[] args) {
        //第一种非静态内部类，初始化方式
        Man m1=new 内部类的初始化方式().new Man(20,50,30);
        Man m2=new 内部类的初始化方式().new Man(22,55,70);
        Man m3=new 内部类的初始化方式().new Man(33,30,60);

        Man[] men=new Man[3];
        men[0]=m1;
        men[1]=m2;
        men[2]=m3;
        Arrays.sort(men);

        //也可以写成下列这样，内部类的初始化方式.Man这个就相当于类型
   //     内部类的初始化方式.Man m=new 内部类的初始化方式().new Man(20,50,30);
        //第二种，静态内部类的实例化方式
          GirlFrend girlFrend1=new 内部类的初始化方式.GirlFrend(18,60,10);
          //也可以写成下面这样
          内部类的初始化方式.GirlFrend girlFrend=new 内部类的初始化方式.GirlFrend(20,30,60);

    }

}



