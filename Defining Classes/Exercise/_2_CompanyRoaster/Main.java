package DefiningClasses.Exercise._2_CompanyRoaster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] tokens = scanner.nextLine().split(" ");

            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String employeeDepartment = tokens[3];
            Employee employee = null;

            if (tokens.length == 6) {

                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee = new Employee(name, salary, position, employeeDepartment, email, age);
            }

            else if (tokens.length==4) {
                employee = new Employee(name, salary, position, employeeDepartment);
            }
            else if (tokens.length == 5) {
                if (tokens[4].matches("\\d+")) {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, employeeDepartment, age);
                }
                else {
                    String email = tokens[4];
                    employee = new Employee(name, salary, position, employeeDepartment, email);
                }
            }

            boolean departmentExist = departmentList.stream().anyMatch(dep -> dep.getName().equals(employeeDepartment));

            if (!departmentExist) {
                Department department = new Department(employeeDepartment);
                departmentList.add(department);

            }
            Department currentDepartment = departmentList
                    .stream()
                    .filter(dep -> dep.getName().equals(employeeDepartment))
                    .findFirst()
                    .get();

            currentDepartment.getEmployees().add(employee);



        }
        Department highestPaidDepartment = departmentList
                .stream()
                .max(Comparator.comparingDouble(Department::averageSalary))
                .get();

        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((first, second) -> Double.compare(second.getSalary(), first.getSalary()))
                .forEach(System.out::println);

    }
}
