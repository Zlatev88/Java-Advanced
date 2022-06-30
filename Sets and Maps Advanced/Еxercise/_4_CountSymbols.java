package SetsAndMapsAdvanced.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, 1);
            }
            else {
               map.put(current, map.get(current) +1 );

            }

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            char key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%c: %d time/s%n", key, value);

        }
    }
}
