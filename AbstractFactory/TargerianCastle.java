package Low_level_design.AbstractFactory;

public class TargerianCastle implements Castle{
    private static final String Description = " This is Targerian's Castle : " + "DragonStone";

    @Override
    public String getDescription() {
        return Description;
    }
}
