package runtimepolymorphism;

public class WashingMachineElectronicItem extends Electronics {

    @Override
    void worksBasedOnSoftware() {
        System.out.println("Works based on hardware and Embedded Software");
    }
    public static void main(String args[])
    {
        WashingMachineElectronicItem w1=new WashingMachineElectronicItem();
        w1.worksBasedOnSoftware();
        Electronics e3=new Electronics();
        e3.worksBasedOnSoftware();
    }


}
