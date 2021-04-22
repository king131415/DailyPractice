package javaDailyProctice.ChongZai;

public class TestChong {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        double c=10.0;
        double d=20.0;
        int result1=add(a,b);
        double result2=add(c,d);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int add(int i,int y) {
        return i+y;
    }
    public static double add(double i,double y){
        return i+y;
    }
}
