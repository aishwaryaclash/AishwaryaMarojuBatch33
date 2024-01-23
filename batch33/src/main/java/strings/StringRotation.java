package strings;

public class StringRotation {

    public static boolean isStringRotated(String s1, String s2){
        if (s1.length() != s2.length()) {
            System.out.println("s2 is not rotated version of s1");
            return false;
        } else {


            String s3 = s1 + s1;



            if (s3.contains(s2)) {
                System.out.println("s2 is a rotated version of s1");
                return true;
            } else {
                System.out.println("s2 is not rotated version of s1");
                return false;
            }

        }
    }




    public static void main(String[] args) {
        StringRotation s= new StringRotation();
        String s1 = "JavaJ2eeStrutsHibernate";

        String s2 = "StrutsHibernateJavaJ2ee";
        s.isStringRotated(s1,s2);

    }


}


