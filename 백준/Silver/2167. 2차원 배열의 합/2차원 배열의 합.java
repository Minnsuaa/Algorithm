import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int[] plus = new int[k];
        for(int a = 0; a < k; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for(int b = i-1; b <= x-1; b++) {
                for(int c = j-1; c <= y-1; c++) {
                    plus[a] += arr[b][c];
                }
            }
        }
        for(int a = 0; a < k; a++) {
            System.out.println(plus[a]);
        }
    }
}