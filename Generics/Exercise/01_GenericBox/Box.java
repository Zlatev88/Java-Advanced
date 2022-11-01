package Generics.Exercise._1_GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box <Т>{
    private List<Т> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(Т value) {
        values.add(value);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Т value : values) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value));
        }

        return sb.toString();
    }
}

