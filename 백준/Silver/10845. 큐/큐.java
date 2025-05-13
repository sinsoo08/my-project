import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            switch (s) {
                case "push":
                    int x = sc.nextInt();
                    queue.offer(x);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(((LinkedList<Integer>)queue).getLast());
                    }
                    break;
            }
        }
    }
}