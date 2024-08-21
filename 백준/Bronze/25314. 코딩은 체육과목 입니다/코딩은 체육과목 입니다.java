import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int N = num.nextInt();

        for(int i = 0; i<N/4; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}