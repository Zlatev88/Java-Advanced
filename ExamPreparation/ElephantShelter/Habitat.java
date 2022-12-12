package sanctuary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Habitat {

    private List<Elephant> data;
    private int capacity;

    public Habitat(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Elephant elephant) {
        if (this.data.size() < this.capacity) {
            this.data.add(elephant);
        }

    }

    public boolean remove(String name) {
        for (Elephant elephant : data) {
            if (elephant.getName().equals(name)) {
                data.remove(elephant);
                return true;
            }
        }
        return false;
    }

    public Elephant getElephant(String retiredFrom) {
        for (Elephant elephant : data) {
            if (elephant.getRetiredFrom().equals(retiredFrom)) {
                return elephant;
            }

        }
        return null;
    }

    public Elephant getOldestElephant(){
        return data.stream().max(Comparator.comparing(elephant -> elephant.getAge())).get();
    }

    public int getAllElephants(){
        return data.size();
    }

    public String getReport(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Saved elephants in the park:%n"));

        for (Elephant elephant : data){
            sb.append(String.format("%s came from: %s%n", elephant.getName(), elephant.getRetiredFrom()));
        }
        return sb.toString();
    }
}
