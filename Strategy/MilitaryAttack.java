package Low_level_design.Strategy;


public class MilitaryAttack {
    public enum Strategy implements WarStrategy {

        Pinnaka(() -> System.out.println("Pinaka Multi barral rocket launching...")),
        ArmTank(() -> System.out.println("Automatic remote control tank launched..."));

        private final WarStrategy warStrategy;

        Strategy(WarStrategy warStrategy) {
            this.warStrategy = warStrategy;
        }

        @Override
        public void attack() {
            warStrategy.attack();
        }
    }
}
