package Low_level_design.AbstractFactory;

public class RoyalKingdom implements KingdomFactory {

    @Override
    public King createKing() {
        return new RoyalKing();
    }

    @Override
    public Army createArmy() {
        return new RoyalArmy();
    }

    @Override
    public Castle createCastle() {
        return new RoyalCastle();
    }
}
