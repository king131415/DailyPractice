package javaDailyProctice.Test0602;

import java.util.Scanner;
//蘑菇阵问题
public class Test0602_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            boolean[][] map = new boolean[n][m];
            int k = scan.nextInt();
            for (int i = 0; i < k; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                map[x - 1][y - 1] = true;
            }
            boolean smallColumn = m < n;
            int small = Math.min(n, m);
            int big = Math.max(n, m);
            float[] dp = new float[small];
            for (int i = big - 1; i >= 0; i--) {
                for (int j = small - 1; j >= 0; j--) {
                    if ((smallColumn? map[i][j] : map[j][i]) == true) {
                        dp[j] = 0;
                    } else {
                        if (i == big - 1 && j == small - 1) {
                            dp[j] = 1;
                        } else if (i == big - 1) {
                            dp[j] = dp[j + 1];
                        } else if (j == small - 1) {
                            //
                        } else {
                            dp[j] = (float) (0.5 * (dp[j] + dp[j + 1]));
                        }
                    }
                }
            }
            System.out.println(String.format("%.2f", dp[0]));
        }
    }
}
