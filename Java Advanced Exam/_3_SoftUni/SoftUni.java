package softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {

    public int capacity;
    public List<Student> data;

    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }


    public int getCount() {
        return data.size();
    }

    public List<Student> getStudents() {
        return data;
    }

    public String insert(Student student) {
        String result = null;

        if (getCount() >= capacity) {
            result = "The hall is full.";
        }

        if (getStudent(student.getFirstName(), student.getLastName()) != null) {
            result = "Student is already in the hall";
        }

        if (result == null) {
            data.add(student);
            result = "Added student " + student.getFirstName() + " " + student.getLastName() + ".";
        }

        return result;
    }

    public String remove(Student student) {
        Student foundStudent = getStudent(student.getFirstName(), student.getLastName());

        if (foundStudent == null) {
            return "Student not found.";
        }

        data.remove(student);

        return "Removed student " + foundStudent.getFirstName() + " " + foundStudent.getLastName()+ ".";
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student student : data) {
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                return student;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Hall size: %d%n", getCount()));
        for (Student student : data) {
            sb.append(String.format("%s%n", student.toString()));

        }
        return sb.toString();
    }
}
