import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int p = scanner.nextInt();
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            arr[i] -= l*p;
        }
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}