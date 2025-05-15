package Low_level_design.AbstractFactory;

public class RoyalArmy implements Army{
    static final String Description = "This is Lannister's  Army";

    @Override
    public String getDescription() {
        return Description;
    }
}
