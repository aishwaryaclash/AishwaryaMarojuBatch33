package arraylists;
import arraylists.RemoveLowGPAStudent;
import org.testng.annotations.Test;
import java.util.ArrayList;
import static junit.framework.Assert.*;


public class RemoveLowGPAStudentTest {
    @Test
    //if arraylist is empty
     void removeLowGpaStudent1()
     {
         ArrayList<Student> emptyList = new ArrayList<>();
         assertEquals(null,RemoveLowGPAStudent.removeLowGPA(emptyList));
     }
     @Test
     void removeLowGpaStudent2()
     {
         ArrayList<Student> nullList = null;
         assertEquals(null,RemoveLowGPAStudent.removeLowGPA(null));

     }
     @Test
     void removeLowGpaStudent3()
     {
         ArrayList<Student> studs=new ArrayList<>();
         studs.add(new Student("Aishwarya","Maroju",3.66));
         studs.add(new Student("Snehasri","Doma",3.2));
         studs.add(new Student("Lahari","Chandra",3.0));
         studs.add(new Student("Homakesh","Thokala",3.4));


     }

}
