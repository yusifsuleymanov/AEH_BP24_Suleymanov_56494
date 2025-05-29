package pl.pp;

import java.util.*;

public class myEleventhApp {

    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = Arrays.asList(
                new Student("12345", "John", "Smith", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Emily", "Johnson", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Michael", "Williams", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Sophia", "Brown", Arrays.asList(5, 4, 4, 5))
        );

        // Finding the student with the highest average grade
        Student topStudent = Collections.max(students, Comparator.comparingDouble(Student::getAverage));
        System.out.printf("Student with the highest average: %s %s (%s) - Average: %.2f\n",
                topStudent.firstName(), topStudent.lastName(), topStudent.index(), topStudent.getAverage());

        // Sorting students by last name
        students.sort(Comparator.comparing(Student::lastName));

        System.out.println("\nStudents sorted by last name:");
        for (Student s : students) {
            System.out.printf("%s %s (%s) - Average: %.2f\n",
                    s.firstName(), s.lastName(), s.index(), s.getAverage());
        }
    }
}
