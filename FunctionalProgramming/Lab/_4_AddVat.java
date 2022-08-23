package FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class _4_AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double > addVat = number-> number*1.2;
        List<Double> prices = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> resultPrice = new ArrayList<>();
        for (double price : prices) {
            double result = addVat.apply(price);
            resultPrice.add(result);
        }
        System.out.println("Prices with VAT:");
        for (double newPrice:resultPrice) {
            System.out.printf("%.2f%n", newPrice);
        }
    }
}
