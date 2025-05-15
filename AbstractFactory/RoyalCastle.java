package Low_level_design.AbstractFactory;

public class RoyalCastle implements Castle{
    static  final String Description = "This is Lannister's Castle : " + " Casterly Rock";

    @Override
    public String getDescription() {
        return Description;
    }
}
