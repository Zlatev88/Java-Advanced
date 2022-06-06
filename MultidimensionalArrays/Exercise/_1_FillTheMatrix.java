package MultidimensionalArrays.Lab.Exercise;

import java.util.Scanner;

public class _1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        int dimension = Integer.parseInt(input[0]);
        String pattern = input[1];

        int [][] matrix = new int[dimension][dimension];
        int counter = 0;
        if (pattern.equals("A")) {
            patternA(matrix, counter);
            printMatrix(matrix);
        }
        else if (pattern.equals("B")) {
            patternB(matrix, counter);
            printMatrix(matrix);
        }
    }

    private static void patternB(int[][] matrix, int counter) {
        for (int col = 0; col < matrix.length ; col++) {
            if (col%2==0) {
                for (int row = 0; row < matrix.length; row++) {
                    counter++;
                    matrix[row][col] = counter;
                }
            }
            else {
                for (int row = matrix.length-1; row >= 0 ; row--) {
                    counter++;
                    matrix[row][col] = counter;
                }
            }
        }
    }

    private static void patternA(int[][] matrix, int counter) {
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                counter++;
                matrix[row][col] = counter;
            }
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
