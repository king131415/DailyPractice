public class Test1219 {
    public static void main(String[] args) {
//        计算1/1-1/2 +1/3-1/4 +1/5 …… + 1/99 - 1/100 的值
        System.out.println(SculaterResult(100));
    }

    public static double Tempresult ( int n){
        return 1.0 / (n - 1) - 1.0 / n;
    }
    public static double SculaterResult (int number) {
        double result = 0;
        for (int a = 2; a <= 100; a += 2) {
            result += Tempresult(a);
        }
        return result;
    }
}



