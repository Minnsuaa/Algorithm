import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m1 = scanner.nextInt();
        int[][] a = new int[n][m1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m1; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int m2 = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] b = new int[m2][k];
        for(int i = 0; i < m2; i++) {
            for(int j = 0; j < k; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < k; j++) {
                int answer = 0;
                for(int p = 0; p < m1; p++) {
                    answer += a[i][p] * b[p][j];
                }
                System.out.print(answer + " ");
            }
            System.out.println();
        }

    }
}