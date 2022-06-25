package SetsAndMapsAdvanced.Lab;

import java.lang.reflect.Array;
import java.util.*;

public class _8_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> map = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double []input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            map.put(student, input);
        }

        for (Map.Entry<String, double[]> entry : map.entrySet()) {
            String names = entry.getKey();
            double [] grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            System.out.printf("%s is graduated with "+ averageGrade, names);
            System.out.println();
        }
    }
    public static double getAverageGrade (double[]array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        return sum/array.length;
    }
}
