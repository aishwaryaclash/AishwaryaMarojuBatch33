package loopsandconditions;
import java.util.*;
public class AgeCondition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person here:");
        int age = sc.nextInt();
        AgeOfPerson(age);
    }
        static void AgeOfPerson(int age)
        {
            if (age < 13) {
                System.out.println("The person is kid");
            } else if (age >= 13 && age <= 19) {
                System.out.println("The person is teen");
            } else {
                System.out.println("The person is Adult");
            }
        }

}
