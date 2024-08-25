import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int[] arr = new int[n];
        int x = num.nextInt();

        for(int i=0; i<n; i++) {
            arr[i] = num.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(arr[i]<x)
                System.out.print(arr[i] + " ");
        }
    }
}