import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(scanner.nextLine());
        }

        List<String> newList = arr.stream().distinct().sorted(Comparator.comparing(String::length).thenComparing(String::compareTo)).collect(Collectors.toList());
        for(String x : newList) System.out.println(x);
    }
}