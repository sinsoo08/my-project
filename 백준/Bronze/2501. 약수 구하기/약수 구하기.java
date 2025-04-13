import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisors.add(i);
            }
        }
        if (K <= divisors.size()) {
            System.out.println(divisors.get(K - 1));
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}