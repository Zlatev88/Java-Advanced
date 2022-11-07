package Generics.Exercise._8_CustomListSorter;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String [] tokens = input.split(" ");
            String command = tokens[0];

            if (command.equals("Add")) {
                String element = tokens[1];
                customList.add(element);
            }
            else if (command.equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                customList.remove(index);
            }
            else if (command.equals("Contains")){
                String element = tokens[1];
                System.out.println(customList.contains(element));
            }

            else if (command.equals("Swap")){
                int firstIndex = Integer.parseInt(tokens[1]);
                int secondIndex = Integer.parseInt(tokens[2]);
                customList.swap(firstIndex, secondIndex);
            }
            else if (command.equals("Greater")){
                String element = tokens[1];
                System.out.println(customList.greater(element));

            }

            else if (command.equals("Max")){
                System.out.println(customList.maxElement());

            }

            else if (command.equals("Min")){
                System.out.println(customList.minElement());

            }
            else if (command.equals("Print")) {
                System.out.println(customList);

            }
            else if (command.equals("Sort")) {
                Sorter.sort(customList);

            }

            input = scanner.nextLine();
        }


    }
}
