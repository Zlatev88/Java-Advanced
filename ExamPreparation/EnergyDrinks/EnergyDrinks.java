package ExamPreparation.EnergyDrinks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] milligrams = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] drinks = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> milligramsStack = new ArrayDeque<>();
        ArrayDeque<Integer> drinksQueue = new ArrayDeque<>();
        int maxCaffeine = 300;
        int startingCaffeine = 0;

        for (int i = 0; i < milligrams.length; i++) {
            milligramsStack.push(milligrams[i]);
        }

        for (int i = 0; i < drinks.length; i++) {
            drinksQueue.offer(drinks[i]);
        }

        while (!milligramsStack.isEmpty() && !drinksQueue.isEmpty()) {
            int sum = milligramsStack.peek()*drinksQueue.peek();

            if (sum + startingCaffeine <= maxCaffeine) {
                startingCaffeine+= sum;
                milligramsStack.pop();
                drinksQueue.poll();
            }
            else {
                milligramsStack.pop();
                int lastDrink = drinksQueue.poll();
                drinksQueue.offer(lastDrink);
                startingCaffeine = startingCaffeine - 30;
                if (startingCaffeine < 0) {
                    startingCaffeine = 0;
                }
            }

        }
        if (!drinksQueue.isEmpty()) {
            String left = drinksQueue.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));

            System.out.println("Drinks left: " + left);
        }
        else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.", startingCaffeine);

    }
}
