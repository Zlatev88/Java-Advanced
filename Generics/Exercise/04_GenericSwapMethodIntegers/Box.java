package Generics.Exercise._4_GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box <Т>{
    private List<Т> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(Т value) {
        values.add(value);
    }

    public void swap (int firstIndex, int secondIndex) {

        Collections.swap(values, firstIndex, secondIndex);
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

