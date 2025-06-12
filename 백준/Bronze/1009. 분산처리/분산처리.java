import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int base = a % 10;
            int[] pattern;
            switch (base) {
                case 0: pattern = new int[]{10}; break;
                case 1: pattern = new int[]{1}; break;
                case 2: pattern = new int[]{2, 4, 8, 6}; break;
                case 3: pattern = new int[]{3, 9, 7, 1}; break;
                case 4: pattern = new int[]{4, 6}; break;
                case 5: pattern = new int[]{5}; break;
                case 6: pattern = new int[]{6}; break;
                case 7: pattern = new int[]{7, 9, 3, 1}; break;
                case 8: pattern = new int[]{8, 4, 2, 6}; break;
                case 9: pattern = new int[]{9, 1}; break;
                default: pattern = new int[]{0};
            }
            int index = (b - 1) % pattern.length;
            System.out.println(pattern[index]);
        }
    }
}