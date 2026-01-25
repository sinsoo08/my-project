import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int sumFirst = a1 + a2;
        int sumSecond = b1 + b2;

        if (sumFirst < sumSecond) {
            System.out.println("Hanyang Univ.");
        } else if (sumFirst > sumSecond) {
            System.out.println("Yongdap");
        } else {
            System.out.println("Either");
        }
    }
}