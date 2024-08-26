import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int[] arr = new int[n];
        int max = -1000000;
        int min = 1000000;

        for(int i=0; i<n; i++) {

            arr[i] = num.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(min + " " + max);
    }
}