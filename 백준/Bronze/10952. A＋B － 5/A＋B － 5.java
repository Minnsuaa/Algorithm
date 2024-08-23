import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        while(true) {
            int A = num.nextInt();
            int B = num.nextInt();
            if(A!=0 || B!=0)
                System.out.println(A+B);
            else
                break;
        }
    }
}