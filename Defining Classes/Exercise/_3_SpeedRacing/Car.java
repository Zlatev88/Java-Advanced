package DefiningClasses.Exercise._3_SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostFor1Km;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostFor1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1Km = fuelCostFor1Km;
        this.distanceTraveled = 0;
    }

    public boolean hasEnoughKm (int kilometers) {
        double fuelNeeded = calculateFuelNeeded(kilometers);
        return  fuelAmount >= fuelNeeded;
    }

    public double calculateFuelNeeded (int kilometers) {
        return kilometers*fuelCostFor1Km;
    }
    public void drive (int kilometers) {
        double fuelNeeded = calculateFuelNeeded(kilometers);
        fuelAmount -= fuelNeeded;
        distanceTraveled+=kilometers;
    }

    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled );
    }
}
