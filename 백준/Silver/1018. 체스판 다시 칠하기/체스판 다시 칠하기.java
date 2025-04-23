import java.util.*;
public class Main {
    static char[][] board;
    static int min = 64;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine().toCharArray();
        }
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                checkBoard(i, j);
            }
        }
        System.out.println(min);
    }
    public static void checkBoard(int x, int y) {
        int count1 = 0;
        int count2 = 0; 
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 'W'로 시작하는 경우
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') count1++;
                    if (board[i][j] != 'B') count2++;
                } else {
                    if (board[i][j] != 'B') count1++;
                    if (board[i][j] != 'W') count2++;
                }
            }
        }
        min = Math.min(min, Math.min(count1, count2));
    }
}