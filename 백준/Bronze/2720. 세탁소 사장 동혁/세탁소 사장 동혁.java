import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0; i < num; i++) {
            int c = scanner.nextInt();
            int q = c / 25;
            c %= 25;
            int d = c / 10;
            c %= 10;
            int n = c / 5;
            int p = c %= 5;
            System.out.println(q + " " + d + " " + n + " " + p);
        }

    }
}