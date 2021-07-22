package javaDailyProctice.Test0722;

import java.util.Scanner;

public class Test0722_2 {
    public static void main(String[] args) {
        int x = 5 >> 2;
        int y = x >>> 2;
        System.out.println(y);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

        }
    }
}
