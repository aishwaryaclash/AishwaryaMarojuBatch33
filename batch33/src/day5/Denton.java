package day5;

public class Denton {
    char unitLetter='A';
    public Denton(char unitLetter)
    {
        this.unitLetter=unitLetter;
        System.out.println("We are implementing parameterized constructor");
    }
    public Denton()
    {
      System.out.println("We are implementing default constructor");
    }

}
