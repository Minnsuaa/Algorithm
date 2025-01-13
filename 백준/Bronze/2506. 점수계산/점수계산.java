import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int answer = 0;
        int cnt = 1;

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i]==1) answer += cnt++;
            else cnt = 1;
        }
        System.out.print(answer);
    }
}