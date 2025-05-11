package Low_level_design.Strategy;

public class War {
    private WarStrategy warStrategy;

    public War(WarStrategy warStrategy) {
        this.warStrategy = warStrategy;
    }
    public void changeStrategy(WarStrategy warStrategy) {
        this.warStrategy = warStrategy;
    }

    public  void goToBattle() {
        warStrategy.attack();
    }
}
