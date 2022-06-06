package MultidimensionalArrays.Lab.Exercise;

import java.util.Scanner;

public class _2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensions = scanner.nextLine().split(" ");
        int firstDimension = Integer.parseInt(dimensions[0]);
        int secondDimension = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[firstDimension][secondDimension];


        for (int rows = 0; rows < matrix.length; rows++) {

            for (int cols = 0; cols < matrix[rows].length; cols++) {
                char first = (char) ('a' + rows);
                char last = (char) ('a'+ rows);
                char middle = (char) ( first+cols);

                String result = String.valueOf(first) + middle + last;
                matrix[rows][cols] = result;

            }
        }
        printMatrix(matrix);

    }private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
