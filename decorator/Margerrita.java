package Low_level_design.decorator;

public class Margerrita implements Pizza{ //is-a
    @Override
    public int getCost() {
        return 150;
    }
}
