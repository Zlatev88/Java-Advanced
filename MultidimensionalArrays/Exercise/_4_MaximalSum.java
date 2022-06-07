package MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _4_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensions = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int [][] matrix = new int[rows][cols];

        int maxSum = Integer.MIN_VALUE;


        for (int i = 0; i < rows; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;
        }

        int [][] result = new int[3][3];

        for (int row = 0; row < rows-2; row++) {

            for (int col = 0; col < cols-2; col++) {

                int sum = matrix[row][col] +matrix[row][col+1] + matrix[row][col+2]

                        +matrix[row+1][col] + matrix[row+1][col+1] + matrix[row+1][col+2]
                        + matrix[row+2][col]  + matrix[row+2][col+1] +  + matrix[row+2][col+2];

                if (sum>maxSum) {
                    maxSum = sum;

                    result = new int [][]{
                        {matrix[row][col], matrix[row][col+1] , matrix[row][col+2]},
                        {matrix[row+1][col] , matrix[row+1][col+1] , matrix[row+1][col+2]},
                        {matrix[row+2][col]  , matrix[row+2][col+1] ,   matrix[row+2][col+2]}
                    };


                }

            }


        }
        System.out.printf("Sum = %d%n", maxSum);
        printMatrix(result);

    }
    public static void printMatrix (int [][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols]+ " ");
            }
            System.out.println();
        }
    }
}
