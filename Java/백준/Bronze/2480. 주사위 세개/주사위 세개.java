import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum;

        if (A == B && B == C) {
            sum = 10000 + A * 1000;
        } 
        else if (A == B || A == C || B == C) {
            int same = (A == B || A == C) ? A : B;
            sum = 1000 + same * 100;
        } 
        else {
            int max = Math.max(A, Math.max(B, C));
            sum = max * 100;
        }

        System.out.println(sum);
        sc.close();
    }
}