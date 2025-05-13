import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int card = sc.nextInt();
            count.put(card, count.getOrDefault(card, 0) + 1);
        }
        int m = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int query = sc.nextInt();
            result.append(count.getOrDefault(query, 0)).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}