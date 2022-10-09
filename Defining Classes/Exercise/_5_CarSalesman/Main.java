package DefiningClasses.Exercise._5_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            Engine engine = null;
            String [] engineInfo = scanner.nextLine().split(" ");
            String engineModel = engineInfo[0];
            int enginePower = Integer.parseInt(engineInfo[1]);



            if (engineInfo.length == 4){

                String engineDisplacement = engineInfo[2];
                String engineEfficiency = engineInfo[3];
                engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);

            }
            else if (engineInfo.length == 2) {
                 engine = new Engine(engineModel, enginePower);
            }
            else if (engineInfo.length == 3) {
                if (engineInfo[2].matches("\\d+")) {
                    String engineDisplacement = (engineInfo[2]);
                    engine = new Engine(engineModel, enginePower, engineDisplacement, "n/a");
                }
                else {
                    String engineEfficiency = engineInfo[2];
                     engine = new Engine(engineModel, enginePower, "n/a", engineEfficiency);

                }
            }
            engineList.add(engine);


        }

        int M = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            //"{Model} {Engine} {Weight} {Color}"
            Engine engine = null;
            Car car = null;
            String []carInfo = scanner.nextLine().split(" ");
            String carModel = carInfo[0];
            String carEngine = carInfo[1];
            
            for (Engine engineType : engineList) {
                if (engineType.getModel().equals(carEngine)) {
                    engine = engineType;
                    break;
                }
            }
            if (carInfo.length == 4) {
                String carWeight = carInfo[2];
                String carColor = carInfo[3];
                car = new Car(carModel, engine, carWeight, carColor);
            }
            else if (carInfo.length == 2) {
                car = new Car(carModel, engine);
            }
            else if (carInfo.length == 3) {
                if (carInfo[2].matches("\\d+")){
                    String carWeight = carInfo[2];
                    car = new Car(carModel, engine, carWeight, "n/a");
                }
                else {
                    String carColor = carInfo[2];
                    car = new Car(carModel, engine,"n/a", carColor);
                }
            }
            cars.add(car);

        }
        for (Car car : cars) {
            System.out.print(car.toString());
        }
    }


}
