import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, cnt, result = 0;
        int[] arr = new int[10];

        for(i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            arr[i] %= 42;
        }
        for(i = 0; i < 10; i++) {
            cnt = 0;
            for(j = i + 1; j < 10; j++) {
                if(arr[i] == arr[j])
                    cnt++;
            }
            if(cnt == 0)
                result++;
        }
        System.out.println(result);
    }
}