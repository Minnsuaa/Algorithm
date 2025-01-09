import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("#")) break;
            int answer = 0;
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i)=='-') answer += 0;
                else if(input.charAt(i)=='\\') answer += Math.pow(8, input.length()-1-i) * 1;
                else if(input.charAt(i)=='(') answer += Math.pow(8, input.length()-1-i) * 2;
                else if(input.charAt(i)=='@') answer += Math.pow(8, input.length()-1-i) * 3;
                else if(input.charAt(i)=='?') answer += Math.pow(8, input.length()-1-i) * 4;
                else if(input.charAt(i)=='>') answer += Math.pow(8, input.length()-1-i) * 5;
                else if(input.charAt(i)=='&') answer += Math.pow(8, input.length()-1-i) * 6;
                else if(input.charAt(i)=='%') answer += Math.pow(8, input.length()-1-i) * 7;
                else if(input.charAt(i)=='/') answer += Math.pow(8, input.length()-1-i) * -1;
            }
            System.out.println(answer);
        }
    }
}