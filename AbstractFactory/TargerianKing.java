package Low_level_design.AbstractFactory;

public class TargerianKing implements King{
    private static final String Description = "The kinf of Targerians is : " + "Daenerys Targerian";

    @Override
    public String getDescription() {
        return Description;
    }
}
