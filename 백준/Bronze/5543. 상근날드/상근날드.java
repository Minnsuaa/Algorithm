import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bugger = new ArrayList<>();
        List<Integer> beverage = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            bugger.add(scanner.nextInt());
        }
        for(int i = 0; i < 2; i++) {
            beverage.add(scanner.nextInt());
        }
        bugger.sort(Comparator.comparing(Integer::intValue));
        beverage.sort(Comparator.comparing(Integer::intValue));

        System.out.print(bugger.get(0)+beverage.get(0)-50);

    }
    
}