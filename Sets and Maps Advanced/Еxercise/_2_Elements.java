package SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _2_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        Set<Integer> setN = new LinkedHashSet<>();
        Set<Integer> setM = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            int currentN = Integer.parseInt(scanner.nextLine());
            setN.add(currentN);
        }

        for (int i = 0; i < M; i++) {
            int currentM = Integer.parseInt(scanner.nextLine());
            setM.add(currentM);
        }
        setN.retainAll(setM);
        for (int e : setN) {
            System.out.print(e + " ");
        }


    }
}
