import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int cnt;

        if(input.isEmpty()) {
            cnt = 0;
        } else {
            String[] word = input.split(" ");
            cnt = word.length;
        }

        System.out.print(cnt);
    }
}