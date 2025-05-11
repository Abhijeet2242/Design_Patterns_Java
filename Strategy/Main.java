package Low_level_design.Strategy;

public class Main {
    private static String AIR_CHIEF = "Air Marshal AP Singh";
    private static String NAVAL_CHIEF = "Admiral Dinesh K Tripathi";
    private static String ARMY_CHIEF = "General Upendra Dwivedi";

    public static void main(String[] args) {
        System.out.println("Air forces start the strike under : " + AIR_CHIEF );
        War war = new War(new AirAttack());
        war.goToBattle();

        System.out.println("Navy start attack on karachi port undser : " + NAVAL_CHIEF);
        war.changeStrategy(new NavyAttack());
        war.goToBattle();

        //using lambda for functional interface
        System.out.println(".......                             ..................");
        System.out.println("lambda with functional interface");
        war = new War(() -> {
            System.out.println("This is lambda strategy currently eceuting");
        });
        war.goToBattle();

        //this is for enum lambda
        System.out.println("Army start under : " + ARMY_CHIEF );
        war.changeStrategy(MilitaryAttack.Strategy.Pinnaka);
        war.goToBattle();
        war.changeStrategy(MilitaryAttack.Strategy.ArmTank);
        war.goToBattle();

    }
}
