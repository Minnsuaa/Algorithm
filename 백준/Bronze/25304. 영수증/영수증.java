import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int X = num.nextInt();
        int N = num.nextInt();
        int sum = 0;

        for(int i = 0; i<N; i++) {
            int a = num.nextInt();
            int b = num.nextInt();
            sum += a*b;
        }
        if(sum==X) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}