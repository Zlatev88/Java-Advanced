package DefiningClasses.Lab._2_Constructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car (String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public Car (String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String carInfo () {
        return String.format("This car is %s %s : %d HP", this.model, this.brand, this.horsePower);
    }


}
