import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
       
        if ((k - a) % d == 0) {
            int n = (k - a) / d + 1;
            if (n > 0) {
                System.out.println(n);
                return;
            }
        }
        
        System.out.println("X");
    }
}