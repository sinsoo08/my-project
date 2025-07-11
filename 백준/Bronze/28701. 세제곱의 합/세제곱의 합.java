import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int se = 0;
        for(int i = 1; i <= n; i ++){
            sum += i;
            se += i*i*i;
        }
        int ze = sum * sum;
        System.out.println(sum);
        System.out.println(ze);
        System.out.println(se);
    }
}