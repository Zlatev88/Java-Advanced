package SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class _4_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> map = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            String number = input[i];
            if (!map.containsKey(number)) {
               map.put((number), 1);
            }
            else {
                map.put((number), map.get(number) +1);
            }
        }
        for (String e : map.keySet()) {
            double decimal = Double.parseDouble(e);
            System.out.printf("%.1f" + " -> " +map.get(e), decimal);
            System.out.println();
        }
    }
}
