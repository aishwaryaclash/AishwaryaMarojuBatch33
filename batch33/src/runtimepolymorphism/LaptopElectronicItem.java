package runtimepolymorphism;

public class LaptopElectronicItem extends Electronics {
    @Override
    void worksBasedOnSoftware() {
       System.out.println("Works based on hardware and Operating Systems");
    }
    public static void main(String args[])
    {
        LaptopElectronicItem l1=new LaptopElectronicItem();
        l1.worksBasedOnSoftware();
        Electronics e1=new LaptopElectronicItem();
        e1.worksBasedOnSoftware();
       Electronics l2=new Electronics();
        l2.worksBasedOnSoftware();
    }
}
