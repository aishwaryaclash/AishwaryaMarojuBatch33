package oopsabstract;

public class PoliceDepartment extends Department {
    private  int departmentSize;
    public PoliceDepartment(int departmentSize)
    {
        this.departmentSize=departmentSize;
    }
    @Override
    int getDepartmentSize()
    {
       return departmentSize;
    }
    public static void main(String args[])
    {
        PoliceDepartment pd=new PoliceDepartment(50000);
        int size=pd.getDepartmentSize();
        System.out.println("Department size is :"+size);
    }
}
