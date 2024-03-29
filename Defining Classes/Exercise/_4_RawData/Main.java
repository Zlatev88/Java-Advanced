package DefiningClasses.Exercise._4_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] tokens = scanner.nextLine().split(" ");
            String carModel = tokens[0];

            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];

            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tires> listTires = new ArrayList<>();

            for (int j = 5; j < tokens.length; j= j+2) {


                double tirePressure = Double.parseDouble(tokens[j]);
                int tireAge = Integer.parseInt(tokens[j+1]);
                Tires tires = new Tires(tireAge, tirePressure);
                listTires.add(tires);

            }
            Car car = new Car(carModel, engine,cargo, listTires);
            cars.add(car);

        }



        String input = scanner.nextLine();
        if (input.equals("fragile")) {
            cars.stream().filter(car -> car.getCargo().getType().equals("fragile"))
                    .filter(car -> car.getTires().stream().anyMatch(tires -> tires.getPressure()<1))
                    .forEach(car -> System.out.println(car.getModel()));
        }
        else {
            cars.stream().filter(car -> car.getCargo().getType().equals("flamable"))
                    .filter(car -> car.getEngine().getPower()>250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}
