import java.util.*;
public class Main {
    static class Document {
        int index;
        int priority;
        public Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            Queue<Document> queue = new LinkedList<>();
            List<Integer> priorities = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int priority = sc.nextInt();
                queue.offer(new Document(i, priority));
                priorities.add(priority);
            }
            priorities.sort(Collections.reverseOrder());
            int count = 0;
            int priorityIndex = 0;
            while (!queue.isEmpty()) {
                Document current = queue.poll();
                if (current.priority == priorities.get(priorityIndex)) {
                    count++;
                    priorityIndex++;
                    if (current.index == M) {
                        System.out.println(count);
                        break;
                    }
                } else {
                    queue.offer(current);
                }
            }
        }
        sc.close();
    }
}