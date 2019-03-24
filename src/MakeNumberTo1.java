import java.util.Scanner;

/***
 * https://www.acmicpc.net/problem/1463
 *
 ***/
public class MakeNumberTo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 1 <= N <= 1000000

        int[] dp = new int[1000001]; //index 0 을 사용하지 않기 때문에 1000001 크기이다.

        dp[1] = 0;
        dp[2] = 1;

        for (int i = 2; i <= N; i++) {

            dp[i] = dp[i-1] + 1;

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i/3] + 1, dp[i]);
            }

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i/2] + 1, dp[i]);
            }
        }

        System.out.print(N + "을 1로 만드는 최소한의 연산 횟수: " + dp[N]);
    }
}
