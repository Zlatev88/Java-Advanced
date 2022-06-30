package SetsAndMapsAdvanced.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<String, String> map = new HashMap<>();
        while(!input.equals("search")) {

            String [] contactInfo = input.split("-");

            String contactName = contactInfo[0];
            String number = contactInfo[1];

            map.put(contactName, number);
            input = scanner.nextLine();
        }

        String names = scanner.nextLine();

        while (!names.equals("stop")) {


            if (!map.containsKey(names)) {
                System.out.printf("Contact %s does not exist.%n", names);
            }
            else {
                System.out.printf("%s -> %s%n", names, map.get(names));
            }







            names = scanner.nextLine();

            }
        }
    }

