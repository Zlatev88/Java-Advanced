package MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_IntersectionfOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String firstMatrix[][] = new String[rows][cols];
        String secondMatrix[][] = new String[rows][cols];

        for (int i = 0; i < firstMatrix.length; i++) {
            String[] arr = scanner.nextLine().split("\\s+");

            firstMatrix[i] = arr;

        }

        for (int i = 0; i < secondMatrix.length; i++) {
            String[] arr = scanner.nextLine().split("\\s+");

            secondMatrix[i] = arr;

        }
        String result[][] = new String[rows][cols];

        for (int row = 0; row < firstMatrix.length; row++) {

            for (int col = 0; col < firstMatrix[row].length; col++) {

                if (firstMatrix[row][col].equals(secondMatrix[row][col])) {

                    String symbol = firstMatrix[row][col];
                    result[row][col] = symbol;

                }
                else {
                    String symbol = "*";
                    result[row][col] = symbol;
                }
            }
        }
        for (String[] element : result) {
            for (String c : element) {
                System.out.print(c + " ");
            }
            System.out.println();
        }



    }
}
