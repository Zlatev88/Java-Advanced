package DefiningClasses.Exercise._5_CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this(model, engine, "n/a", "n/a");
        this.model = model;
        this.engine = engine;

    }



    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
    public String toString () {
        return String.format("%s:%n%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s%n", this.model, engine.getModel(),
                engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), this.weight, this.color);
    }
}
