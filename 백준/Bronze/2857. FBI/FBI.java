import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5];
        ArrayList<Integer> cnt = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            arr[i] = scanner.nextLine();
            if(arr[i].contains("FBI")) cnt.add(i+1);
        }

        if(cnt.isEmpty()) System.out.print("HE GOT AWAY!");
        else for(int x : cnt) System.out.print(x + " ");
    }
}