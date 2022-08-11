package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _5_PredicateNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nameLength = Integer.parseInt(scanner.nextLine());

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).toList();
        Predicate<String> predicate = name -> name.length() <= nameLength;

        list.stream().filter(predicate).forEach(System.out::println);

    }
}
