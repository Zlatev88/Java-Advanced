package SetsAndMapsAdvanced.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _2_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> guestList = new TreeSet<>();

        while (!input.equals("PARTY")) {
            String guest = input;
            guestList.add(guest);


            input = scanner.nextLine();
        }

        String guestsThatCame = scanner.nextLine();

        while (!guestsThatCame.equals("END")) {
            String guests2 = guestsThatCame;
            if (guestList.contains(guests2)) {
                guestList.remove(guests2);
            }



            guestsThatCame = scanner.nextLine();
        }
        System.out.println(guestList.size());
        for (String e : guestList) {
            System.out.println(e);
        }
    }
}
