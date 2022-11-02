package Generics.Exercise._4_GenericSwapMethodIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Box <Integer>box = new Box();

        for (int i = 0; i < n; i++) {
             int element = Integer.parseInt(scanner.nextLine());
            box.add(element);
        }

        String [] indexInfo = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indexInfo[0]);
        int secondIndex = Integer.parseInt(indexInfo[1]);
        box.swap(firstIndex, secondIndex);

        System.out.println(box);
    }
}
