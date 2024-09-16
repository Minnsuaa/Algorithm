import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        int a,b,temp;

        for(a=1; a<=n; a++) {
            arr[a-1] = a;
        }

        for(a=0; a<m; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            for(b=0; b<(j-i+1)/2; b++) {
                temp = arr[i+b-1];
                arr[i+b-1] = arr[j-b-1];
                arr[j-b-1] = temp;
            }
        }

        for(a=0; a<n; a++) {
            System.out.printf(arr[a] + " ");
        }


    }
}