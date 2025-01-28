import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int[] answer = new int[2];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    answer[0] = i+1;
                    answer[1] = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.print(answer[0] + " " + answer[1]);
    }
    
}