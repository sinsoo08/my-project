import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) break;
            int max = Math.max(a, Math.max(b, c));
            int sum = a * a + b * b + c * c - max * max;
            if (sum == max * max) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}