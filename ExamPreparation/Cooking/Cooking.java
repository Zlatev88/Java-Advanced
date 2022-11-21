package ExamPreparation.University.Cooking;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liquidsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] ingredientsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> liquids = new ArrayDeque<>();
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Map<String, Integer> map = new TreeMap<>();
        map.put("Bread", 0);
        map.put("Cake", 0);
        map.put("Fruit Pie", 0);
        map.put("Pastry", 0);

        for (int i = 0; i < liquidsArr.length; i++) {
            liquids.add(liquidsArr[i]);
        }

        for (int i = 0; i < ingredientsArr.length; i++) {
            ingredients.push(ingredientsArr[i]);
        }

        String cookedFood;
        while (!liquids.isEmpty() && !ingredients.isEmpty()) {

            int sum = liquids.peek() + ingredients.peek();

            if (sum == 25) {
                cookedFood = "Bread";

            } else if (sum == 50) {
                cookedFood = "Cake";

            } else if (sum == 75) {
                cookedFood = "Pastry";

            } else if (sum == 100) {
                cookedFood = "Fruit Pie";

            } else {
                cookedFood = null;
            }
            if (cookedFood != null) {
                liquids.pop();
                ingredients.pop();
                int newValue = map.get(cookedFood) + 1;
                map.put(cookedFood, newValue);

            } else {
                liquids.pop();
                ingredients.push(ingredients.pop() + 3);
            }
        }


        boolean allFoodsAreCooked = map.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if (allFoodsAreCooked) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");

        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }


        if (liquids.isEmpty()){
            System.out.println("Liquids left: none");
        }
        else {
            String left = liquids.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.println("Liquids left: " + left);
        }

        if (ingredients.isEmpty()){
            System.out.println("Ingredients left: none");
        }
        else {
            String left = ingredients.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.println("Ingredients left: " + left);
        }

        map.entrySet().forEach(e-> System.out.println(e.getKey()+ ": " + e.getValue()));


    }
}
