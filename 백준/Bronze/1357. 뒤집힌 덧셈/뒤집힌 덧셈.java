import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();

        StringBuffer strX = new StringBuffer(x);
        StringBuffer strY = new StringBuffer(y);

        StringBuffer strPlus = new StringBuffer(Integer.toString(Integer.parseInt(strX.reverse().toString()) + Integer.parseInt(strY.reverse().toString())));

        System.out.print(Integer.parseInt(strPlus.reverse().toString()));
    }
}