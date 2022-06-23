package SetsAndMapsAdvanced.Lab;

import java.util.*;

public class _7_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        HashMap<String,LinkedHashMap<String, List<String>>> map = new LinkedHashMap<>();

        while (n>0 ) {

            String []input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String town = input[2];

            if (!map.containsKey(continent)) {
                map.put(continent, new LinkedHashMap<>());
                map.get(continent).putIfAbsent(country, new ArrayList<>());
                map.get(continent).get(country).add(town);
            }
            else {
                map.get(continent).putIfAbsent(country, new ArrayList<>());
                map.get(continent).get(country).add(town);
            }




            n--;
        }

        for (Map.Entry<String,LinkedHashMap<String, List<String>>> entry : map.entrySet()) {
            String continent = entry.getKey();

            LinkedHashMap<String, List<String>> country = entry.getValue();
            System.out.println(continent+":");

            for (Map.Entry<String, List<String>> entry1 : country.entrySet()) {
                List<String> list = entry1.getValue();
                System.out.print(" " + entry1.getKey()+" -> ");
                System.out.println(String.join(", ",  list));

            }


        }
    }
}
