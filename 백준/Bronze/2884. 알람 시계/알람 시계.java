import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int H = num.nextInt();
        int M = num.nextInt();

        if (M < 45) {
            H--;
            M = (60 + M) - 45;
            
            if(H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M-45));
        }
    }
}