package arraylists;
import arraylists.StudentHashMap;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import arraylists.Student;


import static org.junit.Assert.*;

public class StudentHashMapTest {

    @Test
    public void StudentHashMapRetrieve1( )
    {
        HashMap<String, Student> studentHashMap = new HashMap<>();


        Student expectedStudent = new Student("John", "Doe", 3.5);
        studentHashMap.put(expectedStudent.firstName, expectedStudent);

        Student actualStudent = StudentHashMap.getStudentByName(studentHashMap, "John");
        assertEquals(expectedStudent, actualStudent);

    }
    @Test
    public void testGetStudentByNameWithNonMatchingName() {
        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("John", new Student("John", "Doe", 3.5));
        Student expectedStudent = null;
        Student actualStudent = StudentHashMap.getStudentByName(studentHashMap, "Alice");
        if (expectedStudent == actualStudent) {
            assertNull(actualStudent);
        }
    }
    @Test
    void testGetStudentByNameWithEmptyHashMap() {
        HashMap<String, Student> studentHashMap = new HashMap<>();

        Student student = StudentHashMap.getStudentByName(studentHashMap, "John");
        assertNull(student);
    }

    @Test
    void testGetStudentByNameWithNullHashMap() {
        Student student = StudentHashMap.getStudentByName(null, "John");
        assertNull(student);
    }

    @Test
    void testGetStudentByNameWithNullStudentName() {
        HashMap<String, Student> studentHashMap = new HashMap<>();

        Student student = StudentHashMap.getStudentByName(studentHashMap, null);
        assertNull(student);
    }

    @Test
    void testGetStudentByNameWithEmptyStudentName() {
        HashMap<String, Student> studentHashMap = new HashMap<>();

        Student student = StudentHashMap.getStudentByName(studentHashMap, "");
        assertNull(student);
    }
}
