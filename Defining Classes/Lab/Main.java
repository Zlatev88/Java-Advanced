package DefiningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {

            String [] arr = scanner.nextLine().split(" ");
            String carBrand = arr[0];
            String carModel = arr[1];
            int carHorsePower = Integer.parseInt(arr[2]);

            Car car = new Car();
            car.setBrand(carBrand);
            car.setModel(carModel);
            car.setHorsePower(carHorsePower);

            System.out.println(car.carInfo());

        }



    }

}
