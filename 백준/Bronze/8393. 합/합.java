import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int N = num.nextInt();
        int i, sum = 0;

        for(i=1; i<=N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}