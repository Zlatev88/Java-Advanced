package SetsAndMapsAdvanced.Exercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String [] arr = scanner.nextLine().split("\\s+");
            for (int j = 0; j < arr.length; j++) {
                set.add(arr[j]);
            }
        }
        for (String element: set) {
            System.out.print(element + " ");
        }
    }
}
