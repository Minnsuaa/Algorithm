import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int cnt = 1;
            int answer = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='O') answer += cnt++;
                else cnt = 1;
            }
            System.out.println(answer);
        }
    }
}