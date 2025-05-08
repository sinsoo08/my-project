import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];
        int number = 0;
        int numberIndex = -1;
        for (int i = 0; i < 3; i++) {
            s[i] = sc.next();
            if (s[i].matches("-?\\d+")) {
                number = Integer.parseInt(s[i]);
                numberIndex = i;
            }
        }
        int nextNumber = number + (3 - numberIndex);
        if (nextNumber % 3 == 0 && nextNumber % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (nextNumber % 3 == 0) {
            System.out.println("Fizz");
        } else if (nextNumber % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextNumber);
        }
    }
}