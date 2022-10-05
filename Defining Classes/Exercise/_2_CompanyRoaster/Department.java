package DefiningClasses.Exercise._2_CompanyRoaster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    String name;
    List<Employee> employees = new ArrayList<>();




    public double averageSalary() {

        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
