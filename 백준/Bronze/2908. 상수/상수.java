import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int reversedA = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int reversedB = Integer.parseInt(new StringBuilder(b).reverse().toString());
        System.out.println(Math.max(reversedA, reversedB));
    }
}