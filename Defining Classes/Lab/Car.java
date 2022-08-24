package DefiningClasses;

public class Car {
    private String brand;

    public void setBrand(String brand) {
        this.brand= brand;
    }

    public String getBrand() {
        return this.brand;
    }
    private String model;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }
    private int horsePower;

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }
    public int getHorsePower() {
        return  this.horsePower;
    }

    public String carInfo() {
        return  String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsePower());
    }

}
