package SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class _7_HandOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, HashSet<String>> map = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {

            String []nameArr = input.split(":");
            String name = nameArr[0];
            String [] cardType = nameArr[1].split(", ");
            if (!map.containsKey(name)) {

            map.put(name, new HashSet<>());
            }

            for (int i = 0; i < cardType.length; i++) {
                String card = cardType[i].trim();

                map.get(name).add(card);
            }

            input = scanner.nextLine();
        }

        for (var player : map.entrySet()) {
            String playerName = player.getKey();
            int points = CalculatePoints(player.getValue());
            System.out.printf("%s: %d%n", playerName, points);
        }
    }

    private static int CalculatePoints(HashSet<String> values) {
        int score = 0;
        for (String e : values) {
            String power =e.substring(0, e.length()- 1);
            char type = e.charAt(e.length()-1);


            int cardPoints = getPower(power) * getType(type);
            score+= cardPoints;

        }
        return score;

    }

    private static int getType(char type) {
        int typeScore = 0;
        if (type == 'S') {
            typeScore=4;
        }
        else if (type == 'H') {
            typeScore=3;
        }
        else if (type == 'D') {
            typeScore=2;
        }
        else if (type == 'C') {
            typeScore=1;
        }
        return typeScore;
    }

    private static int getPower(String power) {
        int pow = 0;
        switch (power) {
            case "J" : return 11;
            case "Q" : return 12;
            case "K" : return 13;
            case "A" : return 14;
            default : {
                return Integer.parseInt(power);
            }

        }

    }
}
