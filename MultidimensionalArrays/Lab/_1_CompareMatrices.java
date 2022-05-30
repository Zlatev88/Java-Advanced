package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _1_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int firstRows = dimensions[0];
        int firstCols = dimensions[1];

        int firstMatrix[][] = new int [firstRows][];

        for (int i = 0; i < firstRows; i++) {

            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            firstMatrix[i] = arr;
        }

        dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int secondRows = dimensions[0];
        int secondCols = dimensions[1];

        int secondMatrix [][] = new int[secondRows][];

        for (int i = 0; i < secondRows; i++) {
            int arr[] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            secondMatrix[i] = arr;
        }
         boolean areEqual =(compareMatrixes(firstMatrix, secondMatrix));

        if (areEqual) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }


    private static boolean compareMatrixes (int firstMatrix[][], int secondMatrix[][]){

        if (firstMatrix.length != secondMatrix.length) {
            return false;}

            for (int row = 0; row < firstMatrix.length; row++) {
                if (firstMatrix[row].length != secondMatrix[row].length) {
                    return false;
                }

                for (int col = 0; col < firstMatrix[row].length; col++) {

                    if (firstMatrix[row][col] != secondMatrix[row][col]) {
                        return false;
                    }
                }
            }
        return true;

        }

    }

