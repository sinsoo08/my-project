import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int sum = n * (n+1)/2;
            System.out.println(sum);
        }
    }
}