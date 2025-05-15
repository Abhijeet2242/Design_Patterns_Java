package Low_level_design.AbstractFactory;

public interface KingdomFactory {
    King createKing();
    Castle createCastle();
    Army createArmy();
}
