import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int cnt = 0;

        for(int i = 1; i <= str.length(); i++){
            cnt++;
        }

        System.out.println(cnt);
    }
}