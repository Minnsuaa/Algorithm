import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int A = num.nextInt();
        int B = num.nextInt();
        int C = num.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
