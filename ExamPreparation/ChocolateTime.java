package ExamPreparation.ChocolateTime;

import java.util.*;

public class ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] milkArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        double[] cacaoArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        ArrayDeque<Double> milk = new ArrayDeque<>();
        ArrayDeque<Double> cacao = new ArrayDeque<>();

        Map<String, Integer> chocolates = new TreeMap<>();


        for (int i = 0; i < milkArr.length; i++) {
            milk.offer(milkArr[i]);
        }

        for (int i = 0; i < cacaoArr.length; i++) {
            cacao.push(cacaoArr[i]);
        }

        while (!milk.isEmpty() && !cacao.isEmpty()) {
            int percentage = (int) Math.round((cacao.peek() / (cacao.peek() + milk.peek())) * 100);

            if (percentage == 30) {
                if (!chocolates.containsKey("Milk Chocolate")) {
                    chocolates.put("Milk Chocolate", 1);
                }
                else {
                    chocolates.put("Milk Chocolate", chocolates.get("Milk Chocolate") +1);
                }
                milk.poll();
                cacao.pop();
            }
            else if (percentage == 50) {
                if (!chocolates.containsKey("Dark Chocolate")) {
                    chocolates.put("Dark Chocolate", 1);
                }
                else {
                    chocolates.put("Dark Chocolate", chocolates.get("Dark Chocolate") +1);
                }
                milk.poll();
                cacao.pop();
            }

            else if (percentage == 100) {
                if (!chocolates.containsKey("Baking Chocolate")) {
                    chocolates.put("Baking Chocolate", 1);
                }
                else {
                    chocolates.put("Baking Chocolate", chocolates.get("Baking Chocolate") +1);
                }
                milk.poll();
                cacao.pop();
            }
            else {
                cacao.pop();
                double lastMilk = milk.peek();
                milk.poll();
                milk.add(lastMilk);
            }
        }

        if (chocolates.size() == 3) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }
        else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        StringBuilder sb = new StringBuilder();
        for (var element : chocolates.entrySet()){

            sb.append(String.format("# %s --> %d%n", element.getKey(), element.getValue()));
        }
        System.out.println(sb);



    }
}


