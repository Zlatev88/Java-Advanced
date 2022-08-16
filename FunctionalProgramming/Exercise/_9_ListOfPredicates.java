package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _9_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> predicate = number -> {

            for (Integer numberToDivide : numbers) {
                if (number%numberToDivide != 0) {
                    return false;
                }

            }
            return true;
        };

        for (int i = 1; i <= N; i++) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
