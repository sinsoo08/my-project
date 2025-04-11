import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int line = 1;
        while (X > line) {
            X -= line;
            line++;
        }
        int numerator;
        int denominator;
        if (line % 2 == 1) {
            numerator = line - X + 1;
            denominator = X;
        } else {
            numerator = X;
            denominator = line - X + 1;
        }
        System.out.println(numerator + "/" + denominator);
    }
}