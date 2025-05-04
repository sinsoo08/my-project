import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        boolean as = true;
        boolean de = true;
        for (int i = 0; i < 7; i++) {
            if (arr[i] < arr[i + 1]) {
                de = false;
            } else if (arr[i] > arr[i + 1]) {
                as = false;
            }
        }
        if (as) {
            System.out.println("ascending");
        } else if (de) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}