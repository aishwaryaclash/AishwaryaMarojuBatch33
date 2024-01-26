package arraylists;
import java.util.HashMap;
import arraylists.Student;
public class StudentHashMap {

    public static Student getStudentByName(HashMap<String, Student> studentHashMap, String studentName) {
        if (studentHashMap == null || studentHashMap.isEmpty()) {
            System.out.println("HashMap is null or empty.");
            return null;
        }

        // Check for null or empty studentName
        else if (studentName == null || studentName.isEmpty()) {
            System.out.println("Student name is null or empty.");
            return null;
        }
        // Check if the specified student name exists in the HashMap
        else if (studentHashMap.containsKey(studentName)) {
            return studentHashMap.get(studentName);
        }
        else {
            System.out.println("Student with name '" + studentName + "' not found in the HashMap.");
            return null;
        }

    }
}

