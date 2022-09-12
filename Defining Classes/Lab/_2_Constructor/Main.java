package DefiningClasses.Lab._2_Constructors;

public class Main {
    public static void main(String[] args) {

        Car firstCar = new Car("BMW");
        Car secondCar = new Car("Chevrolet", "V8", 128);

        System.out.println(firstCar.carInfo());
        System.out.println(secondCar.carInfo());


    }
}
