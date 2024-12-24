import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i] += scanner.nextInt();
            }
        }
        int max = 0, num = 0;
        for(int i = 0; i < 5; i++) {
            if(max < arr[i]) {
                max = arr[i];
                num = i+1;
            }
        }
        System.out.println(num + " " + max);
    }
}