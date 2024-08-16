import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int A = num.nextInt();
        int B = num.nextInt();
        int i;

        System.out.println((B%10)*A);
        i = B/10;
        System.out.println((i%10)*A);
        i = i/10;
        System.out.println(A*i);
        System.out.println(A*B);

    }
}
