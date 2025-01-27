import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;

        for(int i = 0; i < n-1; i++)
            answer += scanner.nextInt()-1;
        answer += scanner.nextInt();

        System.out.print(answer);
    }
    
}