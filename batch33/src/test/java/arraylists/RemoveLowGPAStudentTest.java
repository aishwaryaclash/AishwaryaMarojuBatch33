package arraylists;
import arraylists.RemoveLowGPAStudent;
import arraylists.Student;
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
         ArrayList<Student> studs1=new ArrayList<>();

         studs1.add(new Student("Aishwarya","Maroju",3.66));
         studs1.add(new Student("Snehasri","Doma",3.2));
         studs1.add(new Student("Lahari","Chandra",3.0));
         studs1.add(new Student("Homakesh","Thokala",3.4));
         ArrayList<Student> studs=studs1;
         double totalGPA = 0;
         for(Student s:studs)
         {


                 totalGPA += s.GPA;

             }

             double averageGPA = totalGPA / studs.size();

         studs.removeIf(s -> s.GPA < averageGPA);

         assertEquals(studs,RemoveLowGPAStudent.removeLowGPA(studs1));



     }

}
