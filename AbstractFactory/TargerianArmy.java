package Low_level_design.AbstractFactory;

public class TargerianArmy implements Army{
    private static final String Description = "This is Excellent Army of Targerian's : " + "Unsullied";

    @Override
    public String getDescription() {
        return Description;
    }
}
