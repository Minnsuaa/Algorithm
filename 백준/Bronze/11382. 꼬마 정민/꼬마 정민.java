import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        long A = num.nextLong();
        long B = num.nextLong();
        long C = num.nextLong();

        System.out.println(A+B+C);

    }
}
