import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int T = num.nextInt();
        for(int i = 0; i<T; i++) {
            int A = num.nextInt();
            int B = num.nextInt();
            System.out.println("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B));
        }
    }
}