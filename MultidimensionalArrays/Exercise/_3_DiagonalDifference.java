package MultidimensionalArrays.Lab.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {

            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = array;
        }

        int firstSum = 0;
        for (int index = 0; index < matrix.length; index++) {

            firstSum += matrix[index][index];

        }
        int secondSum= 0;
        
        for (int index = 0; index < matrix.length; index++) {
            secondSum+= matrix[index][n-1-index];
        }

        System.out.println(Math.abs(firstSum-secondSum));
    }
}
