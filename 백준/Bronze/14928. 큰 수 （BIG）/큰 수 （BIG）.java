import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        long tem = 0;
        for (int i = 0; i < input.length(); i++) {
        	tem = (tem * 10 + (input.charAt(i) - '0')) % 20000303;
        }
        System.out.println(tem);
    }
}