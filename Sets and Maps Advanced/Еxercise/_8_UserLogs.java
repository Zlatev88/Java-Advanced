package SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class _8_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String [] dataArr = input.split(" ");

            String getIp = dataArr[0];
            String getUser = dataArr[2];

            String ip = getIp.substring(3);
            String user = getUser.substring(5);

            if (!map.containsKey(user)) {
                map.put(user, new LinkedHashMap<>());

            }
            if (!map.get(user).containsKey(ip)) {
                map.get(user).put(ip, 1);
            }
            else {
                int counter = map.get(user).get(ip) +1;
                map.get(user).put(ip, counter);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
            System.out.printf("%s:%n", entry.getKey());

            LinkedHashMap<String, Integer> ipMap = entry.getValue();
            StringBuilder sb = new StringBuilder();

            for (Map.Entry<String, Integer> entry1 : ipMap.entrySet()) {
                String formattedAttack = String.format("%s => %d, ", entry1.getKey(), entry1.getValue());
                sb.append(formattedAttack);
            }
            String finalOutput = sb.substring(0, sb.length() - 2);
            finalOutput = finalOutput + ".";

            System.out.println(finalOutput);
        }








        }
    }

