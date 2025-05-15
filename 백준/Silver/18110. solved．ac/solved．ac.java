import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] levels = new int[n];
        for (int i = 0; i < n; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(levels);
        int removeCount = (int) Math.round(n * 0.15);
        double sum = 0;
        for (int i = removeCount; i < n - removeCount; i++) {
            sum += levels[i];
        }
        int result = (int) Math.round(sum / (n - 2 * removeCount));
        System.out.println(result);
    }
}