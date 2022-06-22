package SetsAndMapsAdvanced.Lab;

import java.util.*;

public class _5_AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentInfo = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String [] info = scanner.nextLine().split("\\s+");
            String studentName = info[0];
            double grade = Double.parseDouble(info[1]);

            if (!studentInfo.containsKey(studentName)) {
                List<Double> grades = new ArrayList<>();
                studentInfo.put(studentName,grades);
                grades.add(grade);
            }
            else {
                studentInfo.get(studentName).add(grade);

            }


        }

        for (Map.Entry<String,List<Double>> entry: studentInfo.entrySet()) {
            String names = entry.getKey();
            List<Double> grades =  entry.getValue();

            double avg = averageGrade(grades);

            System.out.print(names + " -> ");
            for (double e : grades)       {
                System.out.printf("%.2f" + " ", e);
            }
            System.out.printf("(avg: %.2f)", avg);
            System.out.println();





        }
    }
    public static double averageGrade (List<Double> grades) {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum+=grades.get(i);
       }
        return sum/grades.size();
    }

}
