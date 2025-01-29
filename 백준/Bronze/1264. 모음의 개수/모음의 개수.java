import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt;

        while(true) {
            String s = scanner.nextLine();
            cnt = 0;
            if(s.equals("#"))
                break;
            for(int i = 0; i < s.length(); i++) {
                if(Character.toUpperCase(s.charAt(i)) == 'A')
                    cnt++;
                else if(Character.toUpperCase(s.charAt(i)) == 'E')
                    cnt++;
                else if(Character.toUpperCase(s.charAt(i)) == 'I')
                    cnt++;
                else if(Character.toUpperCase(s.charAt(i)) == 'O')
                    cnt++;
                else if(Character.toUpperCase(s.charAt(i)) == 'U')
                    cnt++;
            }
            System.out.println(cnt);
        }
        
    }
    
}