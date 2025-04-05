import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatian) {
            input = input.replace(s, "!");
        }

        System.out.println(input.length());
    }
}