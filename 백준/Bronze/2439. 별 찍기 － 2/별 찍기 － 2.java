import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        for(int i=0; i<n; i++) {
            for(int k = 0; k<n-i-1; k++) {
                System.out.print(' ');
            }
            for(int j = 0; j<i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}