package ExamPreparation.Bomb;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(",");

        String[][] matrix = new String[n][n];

        int startingRow = 0;
        int startingCol = 0;
        int bombCounter = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] arr = line.split(" ");

            matrix[i] = arr;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("s")) {
                    startingRow = i;
                    startingCol = j;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("B")) {
                    bombCounter++;
                }
            }


        }
        int defusedBombs = 0;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("up")) {
                if (startingRow != 0) {
                    startingRow--;
                }

            } else if (commands[i].equals("down")) {
                if (startingRow != n - 1) {
                    startingRow++;
                }

            } else if (commands[i].equals("right")) {
                if (startingCol != n - 1) {
                    startingCol++;
                }

            } else if (commands[i].equals("left")) {
                if (startingCol != 0) {
                    startingCol--;
                }
            }

            if (matrix[startingRow][startingCol].equals("B")) {
                System.out.println("You found a bomb!");
                matrix[startingRow][startingCol] = "+";
                defusedBombs++;
                if (bombCounter == defusedBombs) {
                    System.out.println("Congratulations! You found all bombs!");
                    return;
                }


            } else if (matrix[startingRow][startingCol].equals("e")) {
                System.out.printf("END! %d bombs left on the field", bombCounter - defusedBombs);
                return;
            }

        }
        System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombCounter - defusedBombs, startingRow, startingCol);


    }
}
