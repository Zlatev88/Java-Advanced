package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private int capacity;
    private List<Animal> list;

    public Shelter(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }

    public void add(Animal animal) {
        if (this.list.size() < this.capacity) {
            list.add(animal);
        }
    }

    public boolean remove(String name) {
        for (Animal animal : list) {
            if (animal.getName().equals(name)) {
                list.remove(animal);
                return true;
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker) {
        for (Animal animal : list) {
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)) {
                return animal;
            }

        }
        return null;
    }

    public Animal getOldestAnimal() {
        return list.stream().max(Comparator.comparing(animal -> animal.getAge())).get();
    }

    public int getCount() {
        return list.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The shelter has the following animals:%n"));

        for (Animal animal : list) {
            sb.append(String.format("%s %s%n", animal.getName(), animal.getCaretaker()));
        }
        return sb.toString();
    }
}
