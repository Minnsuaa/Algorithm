import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();

        StringBuffer strX = new StringBuffer(x);
        StringBuffer strY = new StringBuffer(y);
        
        int X = Integer.parseInt(strX.reverse().toString());
        int Y = Integer.parseInt(strY.reverse().toString());

        String plus = Integer.toString(X+Y);
        StringBuffer strPlus = new StringBuffer(plus);

        System.out.print(Integer.parseInt(strPlus.reverse().toString()));
    }
}