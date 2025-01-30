import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        for(int i = 0; i < 4; i++)
            answer += scanner.nextInt();

        System.out.println(answer/60);
        System.out.println(answer%60);
    }
}