package Lab;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guests = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Party!")) {

            String [] commandsArr = input.split(" ");
            String command = commandsArr[0];

            Predicate<String> predicate = getPredicate(commandsArr);

            if (command.equals("Remove")) {
                guests.removeIf(predicate);

            }
            else if (command.equals("Double")) {

                List<String> peopleToAdd = new ArrayList<>();
                guests.stream().filter(predicate).forEach(person -> peopleToAdd.add(person));
                guests.addAll(peopleToAdd);


            }



            input = scanner.nextLine();
        }

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        }
        else {
            Collections.sort(guests);
            String result = String.join(", ", guests) + " are going to the party!";
            System.out.println(result);
        }
    }

    public static Predicate<String> getPredicate (String[] commandsArr) {

        Predicate<String> predicate = null;
        String filterName = commandsArr[1];
        String filterCriteria = commandsArr[2];

        if (filterName.equals("StartsWith")) {
            predicate = name -> name.startsWith(filterCriteria);

        }
        else if (filterName.equals("EndsWith")) {
            predicate = name -> name.endsWith(filterCriteria);

        }
        else if (filterName.equals("Length")) {
            predicate = name -> name.length() == Integer.parseInt(filterCriteria);
        }


        return predicate;
    }
}
