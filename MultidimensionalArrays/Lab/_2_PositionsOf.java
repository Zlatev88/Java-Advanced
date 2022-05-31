package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _2_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        
        int rows = dimensions[0];
        int cols = dimensions[1];

        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows ; i++) {

            int arr[] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        int number = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col]==number) {
                    System.out.println(row +" "+ col);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}
