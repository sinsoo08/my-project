import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i);
                System.out.println();
                N /= i;
            }
        }
    }
}