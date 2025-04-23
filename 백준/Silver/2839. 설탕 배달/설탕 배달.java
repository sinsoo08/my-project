import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                i += n / 5;
                System.out.println(i);
                return;
            }
            n -= 3;
            i++;
        }

        System.out.println(-1);
    }
}