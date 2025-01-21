import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int d = scanner.nextInt();
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int p = scanner.nextInt();

            if(n*p+d == n*s)
                System.out.println("does not matter");
            else if(n*p+d < n*s)
                System.out.println("parallelize");
            else
                System.out.println("do not parallelize");
        }

    }
}