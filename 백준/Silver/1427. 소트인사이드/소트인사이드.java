import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        Integer[] digits = new Integer[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';
        }
        Arrays.sort(digits, Collections.reverseOrder());
        for (int digit : digits) {
            System.out.print(digit);
        }
    }
}