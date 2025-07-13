import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum = h * i;
        int gud = a * r * c;
        System.out.println(sum - gud);
    }
}