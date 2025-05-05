import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[6];
        for (int i = 0; i < 6; i++) {
            s[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();
        int ts = 0;
        for (int i = 0; i < 6; i++) {
            ts += s[i] / t;
            if (s[i] % t != 0) {
                ts++;
            }
        }
        int pen = n / p;
        int pens = n % p;
        System.out.println(ts);
        System.out.println(pen + " " + pens);
    }
}
