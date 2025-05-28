import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String j = sc.next();
        String d = sc.next();
        int j1 = j.length() - 1;
        int d1 = d.length() - 1;
        if (j1 >= d1) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}