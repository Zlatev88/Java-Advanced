package ExamPreparation.TreasureHunt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];

        int currentRow = 0;
        int currentCol = 0;

        for (int i = 0; i < rows; i++) {
            String[] arr = scanner.nextLine().split(" ");
            matrix[i] = arr;

        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j].equals("Y")) {
                    currentRow = i;
                    currentCol = j;
                }

            }

        }
        List<String> directions = new ArrayList<>();
        String commands = scanner.nextLine();
        while (!commands.equals("Finish")) {

            if (commands.equals("up")) {
                if (currentRow != 0) {
                    currentRow--;
                    directions.add("up");
                    if (matrix[currentRow][currentCol].equals("T")) {
                        currentRow++;
                        directions.remove("up");
                    }

                }

            } else if (commands.equals("down")) {
                if (currentRow != rows - 1) {
                    currentRow++;
                    directions.add("down");
                    if (matrix[currentRow][currentCol].equals("T")) {
                        currentRow--;
                        directions.remove("down");
                    }
                }

            } else if (commands.equals("left")) {
                if (currentCol != 0) {
                    currentCol--;
                    directions.add("left");
                    if (matrix[currentRow][currentCol].equals("T")) {
                        currentCol++;
                        directions.remove("left");
                    }
                }

            } else if (commands.equals("right")) {
                if (currentCol != cols - 1) {
                    currentCol++;
                    directions.add("right");
                    if (matrix[currentRow][currentCol].equals("T")) {
                        currentCol--;
                        directions.remove("right");
                    }

                }



            }
            commands = scanner.nextLine();
        }

        if (matrix[currentRow][currentCol].equals("X")){
            System.out.println("I've found the treasure!");
            StringBuilder sb = new StringBuilder();
            sb.append("The right path is ");

                sb.append(String.join(", ", directions));

            System.out.println(sb);
        }
        else {
            System.out.println("The map is fake!");
        }
    }
}
