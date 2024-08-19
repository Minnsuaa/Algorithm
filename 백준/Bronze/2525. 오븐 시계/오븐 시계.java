import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int H = num.nextInt();
        int M = num.nextInt();
        int time = num.nextInt();

        if((M + time) >= 60) {
            H += (M+time)/60;
            M = (M+time)%60;
            if(H>=24) {
                H = H%24;
            }
        }
        else {
            M += time;
        }

        System.out.println(H + " " + M);
    }
}