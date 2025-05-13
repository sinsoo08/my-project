import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s) {
                case "push":
                    int x = sc.nextInt();
                    stack.push(x);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }
    }
}