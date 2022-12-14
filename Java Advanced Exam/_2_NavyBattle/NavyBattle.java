import java.util.Scanner;

public class NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            char[] arr = scanner.nextLine().toCharArray();
            matrix[i] = arr;
        }
        int currentRow = 0;
        int currentCol = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 'S') {
                    currentRow = i;
                    currentCol = j;
                }
            }

        }
        int damageTaken = 0;
        int cruiserDestroyed = 0;
        while (true) {
            String direction = scanner.nextLine();
            matrix[currentRow][currentCol] = '-';

            if (direction.equals("up")) {
                if (currentRow != 0) {
                    currentRow--;
                }

            } else if (direction.equals("down")) {
                if (currentRow != size - 1) {
                    currentRow++;
                }

            } else if (direction.equals("left")) {
                if (currentCol != 0) {
                    currentCol--;
                }
            } else if (direction.equals("right")) {
                if (currentCol != size - 1) {
                    currentCol++;
                }
            }

            if (matrix[currentRow][currentCol] == '*') {
                matrix[currentRow][currentCol] = '-';
                damageTaken++;
                if (damageTaken == 3) {
                    System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", currentRow, currentCol);
                    matrix[currentRow][currentCol] = 'S';
                    break;

                }

            }
            if (matrix[currentRow][currentCol] == 'C') {
                matrix[currentRow][currentCol] = '-';

                cruiserDestroyed++;
                if (cruiserDestroyed == 3) {
                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    matrix[currentRow][currentCol] = 'S';
                    break;
                }
            }

        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }
}
