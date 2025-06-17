import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] check;
    static int[][] arr;
    static int count = 0, ans = 0;
    static int t, m, n, k;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for (; t-- > 0;) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[n + 1][m + 1];
            check = new boolean[n + 1][m + 1];

            for (int i = 0; i < k; i++) {
                StringTokenizer temp = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(temp.nextToken());
                int y = Integer.parseInt(temp.nextToken());
                arr[y + 1][x + 1] = 1;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    dfs(i, j);
                    if (count != 0) {
                        ans++;
                        count = 0;
                    }
                }
            }

            sb.append(ans).append("\n");
            count = 0;
            ans = 0;
        }

        System.out.println(sb);
    }

    public static void dfs(int a, int b) {
        if (!check[a][b]) {
            check[a][b] = true;
            if (arr[a][b] == 1) {
                count++;

                if (a < n && b < m) {
                    if (arr[a + 1][b] == 1) dfs(a + 1, b);
                    if (arr[a - 1][b] == 1) dfs(a - 1, b);
                    if (arr[a][b + 1] == 1) dfs(a, b + 1);
                    if (arr[a][b - 1] == 1) dfs(a, b - 1);
                } else if (a < n && b >= m) {
                    if (arr[a + 1][b] == 1) dfs(a + 1, b);
                    if (arr[a - 1][b] == 1) dfs(a - 1, b);
                    if (arr[a][b - 1] == 1) dfs(a, b - 1);
                } else if (a >= n && b < m) {
                    if (arr[a - 1][b] == 1) dfs(a - 1, b);
                    if (arr[a][b + 1] == 1) dfs(a, b + 1);
                    if (arr[a][b - 1] == 1) dfs(a, b - 1);
                } else {
                    return;
                }
            }
        }
    }
}