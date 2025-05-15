package Low_level_design.AbstractFactory;

public class TargerianKingdom implements KingdomFactory{

    @Override
    public King createKing() {
        return new TargerianKing();
    }

    @Override
    public Castle createCastle() {
        return new TargerianCastle();
    }

    @Override
    public Army createArmy() {
        return new TargerianArmy();
    }
}
