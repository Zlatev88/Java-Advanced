package ExamPreparation.KAT;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] platesArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int[] carsArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> plates = new ArrayDeque<>();
        ArrayDeque<Integer> cars = new ArrayDeque<>();


        for (int i = 0; i < platesArr.length; i++) {
            plates.offer(platesArr[i]);
        }

        for (int i = 0; i < carsArr.length; i++) {
            cars.push(carsArr[i]);
        }
        int days = 0;
        int registeredCars = 0;

        while (!plates.isEmpty() && !cars.isEmpty()) {
            days++;
            int currentPlates = plates.peek() / 2;
            int currentCars = cars.peek();


            if (currentPlates == currentCars) {
                registeredCars += cars.peek();


            } else if (currentPlates < currentCars) {
                registeredCars += currentPlates;
                int remainingCars = cars.peek() -currentPlates;

                cars.add(remainingCars);

            } else {
                registeredCars += cars.peek();
                int remainingPlates = plates.peek() - cars.peek() * 2;

                plates.add(remainingPlates);

            }
            cars.pop();
            plates.poll();

        }
        System.out.printf("%d cars were registered for %d days!%n", registeredCars, days);
        if (plates.isEmpty() && cars.isEmpty()) {
            System.out.println("Good job! There is no queue in front of the KAT!");
        } else if (!plates.isEmpty()) {
            int remainingPlates = 0;
            for (int e : plates) {
                remainingPlates += e;
            }
            System.out.printf("%d license plates remain!", remainingPlates);
        } else {
            int remainingCars = 0;
            for (int e : cars) {
                remainingCars += e;
            }
            System.out.printf("%d cars remain without license plates!", remainingCars);

        }
    }
}
