package javaHomeWork;

  class Animal {
      String name;
      static int age;

      protected static class a{  //静态类一定是内部类
       void  print(){
           System.out.println("a");
          }
      }

     Animal(String name) {
        this.name = name;
//         System.out.println(this.name);
    }
     void eat(String food){
//        System.out.println("我是动物！");
        System.out.println(food);
    }
      public static void main(String[] args) {
          Animal.a b=new Animal.a();
          b.print();
      }
}
