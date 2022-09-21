package DefiningClasses.Lab.Exercise._1_OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            list.add(person);
            System.out.println();
        }
        list.stream().filter(e->e.getAge()>30).sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);







    }


}