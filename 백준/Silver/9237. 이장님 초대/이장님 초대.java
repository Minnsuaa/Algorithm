import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        Integer[] compare = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            compare[i] = arr[i] + (i+1);
        }
        int max = compare[0];
        for(int i = 0; i < n; i++) {
            if(compare[i] > max)
                max = compare[i];
        }
        System.out.print(max+1);
    }
}