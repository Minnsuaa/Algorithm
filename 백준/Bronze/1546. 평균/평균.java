import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        double score = 0;
        int i, max = 0;

        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            score += arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
        score /= n;
        System.out.println((score/max)*100);
    }
}