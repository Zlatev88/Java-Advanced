package SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _3_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));


        for (int i = 0; i < 50; i++)

         {


            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }
            int firstNumber = firstDeck.iterator().next();
            firstDeck.remove(firstNumber);

            int secondNumber = secondDeck.iterator().next();
            secondDeck.remove(secondNumber);

            if (firstNumber>secondNumber) {
                firstDeck.add(firstNumber);
                firstDeck.add(secondNumber);
            }

            else if (secondNumber>firstNumber) {

                secondDeck.add(firstNumber);
                secondDeck.add(secondNumber);
            }


        }
        if ( firstDeck.size()< secondDeck.size()) {

            System.out.println("Second player win!");

        }

        else if ( secondDeck.size()<firstDeck.size()) {
            System.out.println("First player win!");



        }
        else {
            System.out.println("Draw");

        }
    }
}
