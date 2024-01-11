public class Student {
    private String name;
    public Student(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public static void main(String args[])
    {
        Student obj=new Student("Aishwarya ");
        System.out.println("Student Name is :"+obj.getName());
    }

}
