import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        int answer = 0, min = 0;

        for(int i = 0; i < 7; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i]%2==1) {
                answer += arr[i];
                min = arr[i];
            }
        }
        for(int i = 0; i < 7; i++) {
            if(arr[i]%2==1 && arr[i] < min)
                min = arr[i];
        }
        if(answer == 0) {
            System.out.print(-1);
        } else {
            System.out.println(answer);
            System.out.println(min);
        }
    }
}