package MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String [][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] arr = scanner.nextLine().split(" ");
            matrix[i] = arr;
        }

        String input  = scanner.nextLine();

        while (!input.equals("END")) {

            String [] commandArr = input.split(" ");

            String command = commandArr[0];
            if (isValid(commandArr)) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }
            int row1 = Integer.parseInt(commandArr[1]);
            int col1 = Integer.parseInt(commandArr[2]);
            int row2 = Integer.parseInt(commandArr[3]);
            int col2 = Integer.parseInt(commandArr[4]);

            if (isInvalidIndex(matrix, row1, col1) || isInvalidIndex(matrix,row2, col2)){
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }
            else{


                        String temporary = matrix[row1][col1];
                        matrix[row1][col1] = matrix[row2][col2];
                        matrix[row2][col2] = temporary;


            }

            printMatrix(matrix);
            input = scanner.nextLine();
        }
    }

    public static boolean isValid (String[] commandArray){

        if (commandArray.length!=5) {
            return true;
        }

        else if (!commandArray[0].equals("swap")) {
            return  true;
        }

       return false;
    }

    public static boolean isInvalidIndex (String [][] matrix, int row, int col){

        if (row<0 || row> matrix.length || col<0 || col>matrix[row].length) {
            return true;
        }

        return false;
    }
    public static void printMatrix (String matrix[][]) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
