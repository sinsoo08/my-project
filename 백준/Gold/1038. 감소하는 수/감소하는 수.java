import java.util.*;
public class Main {
    static ArrayList<Long> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            dfs(i, i);
        }
        Collections.sort(list);
        if (N >= list.size()) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(N));
        }
    }
    public static void dfs(long num, int lastDigit) {
        list.add(num);
        for (int i = 0; i < lastDigit; i++) {
            dfs(num * 10 + i, i);
        }
    }
}