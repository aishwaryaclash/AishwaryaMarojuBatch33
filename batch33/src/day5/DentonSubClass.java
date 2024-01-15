package day5;

public class DentonSubClass extends Denton
{
    char streetName='T';
    public DentonSubClass(char unitLetter ,char streetName)
    {
        super(unitLetter);
        this.streetName=streetName;
    }
    public DentonSubClass(char streetName)
    {

        this.streetName=streetName;
    }

}
