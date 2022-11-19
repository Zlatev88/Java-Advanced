package university;

/*import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    public int capacity;
    public List<Student> studentList;

    public University(int capacity) {
        this.capacity = capacity;
        this.studentList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public int getStudentCount() {
        return studentList.size();
    }

    public String registerStudent(Student student) {

        String result = null;

        if (getStudentCount() > capacity) {
            result = "No seats in the university";
        }

        for (Student s : studentList) {
            if (s.getFirstName().equals(student.getFirstName()) && s.getLastName().equals(student.getLastName())) {
                result = "Student is already in the university";
                break;
            }
        }

        if (result == null) {
            studentList.add(student);
            result = "Added student " + student.getFirstName() + " " + student.getLastName();
        }


        return result;
    }

    public String dismissStudent(Student student) {
        for (Student s : studentList) {
            if (s.getFirstName().equals(student.getFirstName()) && s.getLastName().equals(student.getLastName())) {

                studentList.remove(student);
                return "Removed student " + student.getFirstName() + " " + student.getLastName();
            }
        }

        return "Student not found";


    }

    public Student getStudent(String firstName, String secondName) {
        for (Student s : studentList) {
            if (firstName.equals(s.getFirstName()) && secondName.equals(s.getLastName())) {
                return s;
            }
        }
        return null;
    }

    public String getStatistics() {
       // String result;
        //StringBuilder sb = new StringBuilder();
       // for (Student s : studentList) {
          //   result= "==Student: First Name = " + s.getFirstName()+", " + "Last Name = " + s.getLastName()
                //    + ", " +"Best Subject = " +s.getBestSubject();
           //  sb.append(String.format("%s%n", result));
      //  }
        return studentList.stream()
                .map(s->String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s" ,s.getFirstName(), s.getLastName(), s.getBestSubject()))
                .collect(Collectors.joining(System.lineSeparator()));
    }
}*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return students.size();
    }

    public String registerStudent(Student student) {
        String result = null;

        if (getStudentCount() >= capacity) {
            result = "No seats in the university";
        }

        if (getStudent(student.firstName, student.lastName) != null) {
            result = "Student is already in the university";
        }

        if (result == null) {
            students.add(student);
            result = "Added student " + student.getFirstName() + " " + student.getLastName();
        }

        return result;
    }

    public String dismissStudent(Student student) {
        Student foundStudent = getStudent(student.getFirstName(), student.getLastName());

        if (foundStudent == null) {
            return "Student not found";
        }

        students.remove(student);

        return "Removed student " + foundStudent.getFirstName() + " " + foundStudent.getLastName();
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                return student;
            }
        }
        return null;
    }

    public String getStatistics() {
        return students.stream()
                .map(s -> String.format(
                        "==Student: First Name = %s, Last Name = %s, Best Subject = %s",
                        s.getFirstName(), s.getLastName(), s.getBestSubject()))
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
