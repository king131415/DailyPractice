package javaDailyProctice.Test0720;

import java.util.Arrays;
import java.util.Scanner;

public class Test0720_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        long[] data;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            data = new long[3 * n];
            for (int i = 0; i < data.length; i++) {
                data[i] = scanner.nextLong();
            }
            Arrays.sort(data);
            long result = 0;
            for (int i = 0; i < n; i++) {
                result += data[data.length - (2 * (i + 1))];
            }
            System.out.println(result);
        }
    }
}
