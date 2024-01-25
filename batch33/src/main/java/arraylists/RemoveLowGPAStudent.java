package arraylists;
import java.util.ArrayList;
public class RemoveLowGPAStudent {
    public static void main(String args[]) {
        // Sample ArrayList of Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Smith", 3.2));
        students.add(new Student("Bob", "Johnson", 3.8));
        students.add(new Student("Alice", "Williams", 3.0));

        // Calculate average GPAStudent
        ArrayList<Student> removedList = removeLowGPA(students);
        System.out.println("After removal of students with low gpa");
        for (Student s : removedList) {

            System.out.println(s.firstName + " " + s.lastName + " " + "GPA :" + s.GPA);
        }
    }

    static ArrayList<Student> removeLowGPA(ArrayList<Student> students) {
        if (students != null && !students.isEmpty()) {
            // Calculate average GPA
            double totalGPA = 0;
            for (Student student : students) {
                totalGPA += student.GPA;
            }
            double averageGPA = totalGPA / students.size();

            // Remove students with GPA less than average
            students.removeIf(student -> student.GPA < averageGPA);
            return students;
        } else {


            return null;
        }

    }
}