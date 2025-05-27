import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i = 0; i < t; i++){
	        int n = sc.nextInt();
	        int[] dp = new int[12];
	        dp[1] = 1;
	        dp[2] = 2;
	        dp[3] = 4;
	         for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }
            System.out.println(dp[n]);
	    }
	}
}