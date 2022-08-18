package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(e->e%2!=0);

        System.out.println(numbers.stream().map(e->String.valueOf(e)).collect(Collectors.joining(", ")));

        Collections.sort(numbers);

        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));

    }
}
