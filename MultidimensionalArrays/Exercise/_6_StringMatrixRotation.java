package MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _6_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();

        String input = scanner.nextLine();
        List<String> words = new ArrayList<>();
        int maxSize = Integer.MIN_VALUE;
        while (!input.equals("END")) {

            words.add(input);

            input = scanner.nextLine();
        }
        int rows = words.size();

        for (int i = 0; i < words.size(); i++) {
            int size = words.get(i).length();
            if (size > maxSize) {
                maxSize = size;
            }

        }
        int cols = maxSize;

        char [][] matrix = new char[rows][cols];

        for (int row = 0; row <rows; row++) {

            String currentWord = words.get(row);
            for (int col = 0; col < cols; col++) {

                if (col<currentWord.length()) {
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                }
                else {
                    matrix[row][col] = ' ';
                }
            }
        }

        String  angleString = rotation.split("[()]")[1];
        int angle = Integer.parseInt(angleString);

        int angleOfRotation = angle%360;

        if (angleOfRotation == 0) {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col] + "");
                }
                System.out.println();
            }

        }else if (angleOfRotation==90) {
                for (int col = 0; col < cols ; col++) {
                    for (int row = rows-1; row >= 0; row--) {
                        System.out.print(matrix[row][col] + "");
                    }
                    System.out.println();
                }
            }
        else if (angleOfRotation==180) {
            for (int row = rows-1; row >= 0 ; row--) {
                for (int col = cols-1; col >= 0; col--) {
                    System.out.print(matrix[row][col] + "");
                }
                System.out.println();
            }
        }

        else if (angleOfRotation==270) {
            for (int col = cols-1; col >=0; col--) {
                for (int row = 0; row <rows; row++) {
                    System.out.print(matrix[row][col] + "");
                }
                System.out.println();
            }
        }

    }
}
