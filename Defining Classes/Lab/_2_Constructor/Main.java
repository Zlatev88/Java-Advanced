package DefiningClasses.Lab._2_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Object> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] arr = scanner.nextLine().split(" ");

            String brand = arr[0];
            if (arr.length == 1) {
                Car car = new Car(brand);
            list.add(car);
                System.out.println(car.carInfo());
            }
            else {
                String model = arr[1];
                int horsePower = Integer.parseInt(arr[2]);
                Car car = new Car(brand,model, horsePower);
                list.add(car);
                System.out.println(car.carInfo());
            }


        }


    }
}
