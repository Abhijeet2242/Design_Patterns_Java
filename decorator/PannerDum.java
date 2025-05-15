package Low_level_design.decorator;

public class PannerDum implements Pizza{  //is-a
    @Override
    public int getCost() {
        return 300;
    }
}
