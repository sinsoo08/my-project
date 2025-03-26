import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; 
        int result = 0;
        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            arr[i] = input % 42;
        }
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) result++;
        }
        System.out.println(result);
    }
}