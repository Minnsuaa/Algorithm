import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[][] arr = new Integer[8][2];
        Integer[] num = new Integer[5];
        int answer = 0;

        for(int i = 0; i < 8; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = i+1;
        }
        
        Arrays.sort(arr, (o1, o2) -> o2[0] - o1[0]);
        for(int i = 0; i < 5; i++) num[i] = arr[i][1];
        Arrays.sort(num);
        for(int i = 0; i < 5; i++) answer += arr[i][0];

        System.out.println(answer);
        for(Integer x : num) System.out.print(x + " ");
    }
}