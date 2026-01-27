import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        for (int i = 0; i < test; i++) {
            int[] dec = new int[10];
            String[] num = sc.next().split("");
            for (String n : num) {
                dec[Integer.parseInt(n)] = 1;
            }
            
            int cnt = 0;
            for (int d : dec) {
                cnt += d;
            }
            
            System.out.println(cnt);
        }
    }
}