package ExamPreparation.RallyRacing;

import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());
        String number = scanner.nextLine();
        boolean isFinished = false;

        int currentRow = 0;
        int currentCol = 0;
        int distanceTraveled = 0;

        String[][] matrix = new String[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.equals("up")) {
                if (currentRow != 0) {
                    currentRow--;

                }


            } else if (command.equals("down")) {
                if (currentRow != matrixSize - 1) {
                    currentRow++;

                }

            } else if (command.equals("left")) {
                if (currentCol != 0) {
                    currentCol--;

                }

            } else if (command.equals("right")) {
                if (currentCol != matrixSize - 1) {
                    currentCol++;

                }
            }

            if (matrix[currentRow][currentCol].equals("T")) {
                matrix[currentRow][currentCol] = ".";
                distanceTraveled += 30;

                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                        if (matrix[i][j].equals("T")) {
                            currentRow = i;
                            currentCol = j;
                            matrix[i][j] = ".";
                        }
                    }
                }

            }
            else if (matrix[currentRow][currentCol].equals("F")) {
                matrix[currentRow][currentCol] = "C";
                distanceTraveled+=10;

                isFinished = true;
                break;
            }
            else if (matrix[currentRow][currentCol].equals(".")){
                distanceTraveled+=10;
            }
            command = scanner.nextLine();
        }
        if (isFinished) {
            System.out.printf("Racing car %S finished the stage!%n", number);
            System.out.printf("Distance covered %d km.%n", distanceTraveled);
        }

        else  {
            matrix[currentRow][currentCol] = "C";

            System.out.printf("Racing car %s DNF.%n", number);
            System.out.printf("Distance covered %d km.%n", distanceTraveled);
        }


        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
