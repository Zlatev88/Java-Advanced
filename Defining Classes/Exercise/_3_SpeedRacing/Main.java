package DefiningClasses.Exercise._3_SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String [] tokens = scanner.nextLine().split(" ");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostFor1Km = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuelAmount, fuelCostFor1Km);
            cars.put(model, car);

        }
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String []tokens = input.split(" ");


            String model = tokens[1];
            int amountOfKm = Integer.parseInt(tokens[2]);

            Car currentCar = cars.get(model);

            if (!currentCar.hasEnoughKm(amountOfKm)) {

                System.out.println("Insufficient fuel for the drive");
            }

            else {
                currentCar.drive(amountOfKm);


            }






            input = scanner.nextLine();
        }
        cars.values().stream().forEach(System.out::println);
    }
}
