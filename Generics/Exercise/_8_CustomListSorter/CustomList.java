package Generics.Exercise._8_CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable> {

    private List<T> values;


    public CustomList() {
       values = new ArrayList<>();
    }
    public void add(T element) {
        values.add(element);
    }

    public T remove (int index) {
       return values.remove(index);
    }

    public boolean contains (T element) {
        return values.contains(element);
    }
    public void swap (int firstIndex, int secondIndex) {
        Collections.swap(values, firstIndex, secondIndex);
    }

    public int greater(T element) {
        return (int) values.stream().filter(existing->existing.compareTo(element)>0).count();
        }

        public T maxElement (){
            return values.stream().max(Comparable::compareTo).get();
        }

        public T minElement (){
        return values.stream().min(Comparable::compareTo).get();
    }

    public int size(){
        return values.size();
    }

    public T get(int index){
        return values.get(index);
    }
    @Override

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s%n", value.toString()));

        }
        return sb.toString().trim();
    }

    }

