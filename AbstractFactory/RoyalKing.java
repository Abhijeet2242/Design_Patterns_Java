package Low_level_design.AbstractFactory;

import jdk.jfr.Description;

public class RoyalKing implements King{
    static final String Description = "This is King of a Lannister's Army : " + " Tywin Lannister";
    @Override
    public String getDescription() {
        return Description;
    }
}
