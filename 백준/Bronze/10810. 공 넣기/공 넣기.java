import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a;

        int n = num.nextInt();
        int m = num.nextInt();

        int[] arr = new int[n];


        for(a=0; a<m; a++) {
            int i = num.nextInt();
            int j = num.nextInt();
            int k = num.nextInt();

            for(i=i; i<=j; i++) {
                arr[i-1] = k;
            }
        }
        for(a=0; a<n; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}