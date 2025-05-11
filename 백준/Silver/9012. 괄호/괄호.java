import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            System.out.println(isVPS(s));
        }
    }
    public static String isVPS(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}