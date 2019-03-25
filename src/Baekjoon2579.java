import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2579
 * **/
public class Baekjoon2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] steps = new int[count+1];
        for (int i = 1; i <= count; i++) {
            steps[i] = sc.nextInt();
        }

        int[] dp = new int[301];
        dp[0] = 0;
        dp[1] = steps[1];
        dp[2] = steps[1] + steps[2];

        for (int i = 3; i <= count; i++) {
            dp[i] = Math.max((dp[i-3] + steps[i-1] + steps[i]),(dp[i-2] + steps[i]));
        }

        System.out.println(dp[count]);
    }
}
