package java0218;
public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        }catch (ArithmeticException e){
            e.printStackTrace();//打印异常信息！！
        }
        System.out.println("后面的代码！");

    }
    public static int divide(int x, int y) throws ArithmeticException{
          if (y == 0) {
              throw new ArithmeticException("算术异常！！！");
          }
         return x / y;
    }
}
