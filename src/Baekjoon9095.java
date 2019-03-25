import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9095
 ***/

public class Baekjoon9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[] dp = new int[11];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 0; i < testcase; i++) {
            int n = sc.nextInt();

            for (int j = 3; j <= n; j++) {

                dp[j] = dp[j - 1]+ dp[j - 2] + dp[j - 3];
            }

            System.out.println(dp[n]);
        }
    }
}
