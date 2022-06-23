package SetsAndMapsAdvanced.Lab;

import java.util.*;

public class _6_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, Map<String, Double>> products = new TreeMap<>();

        while (!input.equals("Revision")){

            String [] arr =  input.split(", ");

            String shop = arr[0];
            String product = arr[1];
            double price = Double.parseDouble(arr[2]);


            if (!products.containsKey(shop)) {
                products.put(shop, new LinkedHashMap<>());
                products.get(shop).put(product, price);
            }
            else {
                products.get(shop).put(product, price);

            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : products.entrySet()) {
            Map<String, Double> map = entry.getValue();
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> entry2 : map.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f", entry2.getKey(), entry2.getValue());
                System.out.println();
            }
        }

    }
}
