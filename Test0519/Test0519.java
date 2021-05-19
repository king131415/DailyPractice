package javaDailyProctice.Test0519;

import java.util.Scanner;

public class Test0519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            if((a+b)>c && (a+c)>b &&(b+c)>a){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }
}
