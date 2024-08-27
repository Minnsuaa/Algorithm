import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] arr = new int[9];
        int i, cnt=0, max=0;

        for(i=0; i<9; i++) {
            arr[i] = num.nextInt();
        }
        for(i=0; i<9; i++) {
            if(max<arr[i]) {
                max=arr[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}