package arraylists;
import java.util.ArrayList;
public class RemoveLowGPAStudent {


    static  ArrayList<Student> removeLowGPA(ArrayList<Student> students) {
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