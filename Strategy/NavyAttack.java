package Low_level_design.Strategy;

public class NavyAttack implements WarStrategy{
    @Override
    public void attack() {
        System.out.println("Navy Start attack & INS Vikrant leading from the front");
    }
}
