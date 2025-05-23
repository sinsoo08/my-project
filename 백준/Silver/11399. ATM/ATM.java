import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int total = 0;
        int current = 0;
        for (int i = 0; i < n; i++) {
            current += p[i];
            total += current;
        }
        System.out.println(total);
    }
}