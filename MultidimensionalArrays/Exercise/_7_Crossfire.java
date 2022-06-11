package MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _7_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols= dimensions[1];
        int counter = 1;

        List<List<Integer>> matrix= new ArrayList<>();

        fillMatrix(rows, cols, counter, matrix);

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            String arr[] = input.split("\\s+");
            int row = Integer.parseInt(arr[0]);
            int col = Integer.parseInt(arr[1]);
            int radius = Integer.parseInt(arr[2]);

            for (int rowToRemove = row-radius; rowToRemove <= row + radius; rowToRemove++) {

                if (isInRange(rowToRemove,col,matrix) && rowToRemove!=row) {
                    matrix.get(rowToRemove).remove(col);
                }
            }

            for (int colToRemove = col+radius; colToRemove  >= col-radius; colToRemove--) {

                if (isInRange(row,colToRemove, matrix)) {
                    matrix.get(row).remove(colToRemove);
                }
            }
            matrix.removeIf(List::isEmpty);


            input = scanner.nextLine();
        }

        for(List<Integer> integers : matrix){
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }


    }

    private static void fillMatrix(int rows, int cols, int counter, List<List<Integer>> matrix) {
        for (int row = 0; row < rows; row++) {

            matrix.add(new ArrayList<>());

            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(counter);
                counter++;
            }
        }
    }
    private static boolean isInRange(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}



