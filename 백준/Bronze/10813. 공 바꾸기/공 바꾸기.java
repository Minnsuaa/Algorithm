import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int m = num.nextInt();
        int[] arr = new int[n];

        int a, temp, cnt = 0;

        for(a=0; a<n; a++) {
            arr[a] = ++cnt;
        }

        for(a=0; a<m; a++) {
            int i = num.nextInt();
            int j = num.nextInt();

            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for(a=0; a<n; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}