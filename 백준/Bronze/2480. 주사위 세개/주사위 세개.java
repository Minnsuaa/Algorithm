import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int A = num.nextInt();
        int B = num.nextInt();
        int C = num.nextInt();

        if(A==B && A==C) {
            System.out.println(10000+(A*1000));
        }
        else if(A==B && A!=C) {
            System.out.println(1000+(A*100));
        }
        else if(B==C && B!=A) {
            System.out.println(1000+(B*100));
        }
        else if(C==A && C!=B) {
            System.out.println(1000+(C*100));
        }
        else {
            if(A>B && A>C)
                System.out.println(A*100);
            else if(B>A && B>C)
                System.out.println(B*100);
            else if(C>A && C>B)
                System.out.println(C*100);
        }
    }
}