package day5;

public class DentonMainClass {
    public static void main(String args[])
    {
        DentonSubClass cls=new DentonSubClass('Q','P');
        System.out.println("The Unit Letter of Denton is : "+cls.unitLetter);
        System.out.println("The Street Name of Denton Subclass is : "+cls.streetName);
        DentonSubClass cls2=new DentonSubClass('Z');
        System.out.println("The Street Name of Denton Subclass for object 2 is :"+cls2.streetName);
    }
}
