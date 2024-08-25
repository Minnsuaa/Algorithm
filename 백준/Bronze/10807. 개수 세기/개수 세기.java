import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;

        int n = num.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = num.nextInt();
        }
        int v = num.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==v)
                cnt++;
        }
        System.out.println(cnt);
    }
}