import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = "SciComLove";
        String s = sc.next();
        
        int a = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s.charAt(i)) {
                a++;
            }
        }
        
        System.out.println(a);
    }
}