import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        int totalTime = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if ('A' <= ch && ch <= 'C') totalTime += 3;
            else if ('D' <= ch && ch <= 'F') totalTime += 4;
            else if ('G' <= ch && ch <= 'I') totalTime += 5;
            else if ('J' <= ch && ch <= 'L') totalTime += 6;
            else if ('M' <= ch && ch <= 'O') totalTime += 7;
            else if ('P' <= ch && ch <= 'S') totalTime += 8;
            else if ('T' <= ch && ch <= 'V') totalTime += 9;
            else if ('W' <= ch && ch <= 'Z') totalTime += 10;
        }

        System.out.println(totalTime);
    }
}