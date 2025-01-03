import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int cnt = 0;
            char input = scanner.next().charAt(0);
            if(input=='#') break;
            String str = scanner.nextLine();
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==input || str.charAt(i)==Character.toUpperCase(input))
                    cnt++;
            }
            System.out.println(input + " " + cnt);
        }
    }
}