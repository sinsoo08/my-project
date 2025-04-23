import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int re = 0;
        for (int i = 1; i < n; i++) {
            int sum = i;
            int tmp = i;
            while (tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (sum == n) {
                re = i;
                break;
            }
        }
        System.out.println(re);
    }
}