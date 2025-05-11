package Low_level_design.Strategy;

public class AirAttack implements WarStrategy{
    @Override
    public void attack() {
        System.out.println("Air force destroyed enemies F-16b and JF-17");
    }
}
