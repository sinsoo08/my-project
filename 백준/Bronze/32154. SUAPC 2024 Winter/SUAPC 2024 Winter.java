import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        String[][] board = {{"11", "A B C D E F G H J L M"},
                {"9", "A C E F G H I L M"},
                {"9", "A C E F G H I L M"},
                {"9", "A B C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A B C F G H L M"}};

        System.out.println(board[N-1][0]);
        System.out.println(board[N-1][1]);
    }
}