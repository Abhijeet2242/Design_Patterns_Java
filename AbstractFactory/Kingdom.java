package Low_level_design.AbstractFactory;

import lombok.Getter;
import lombok.Setter;


public class Kingdom {
    private King king;
    private Castle castle;
    private Army army;
    public King getKing() {
        return king;
    }

    public Castle getCastle() {
        return castle;
    }

    public Army getArmy() {
        return army;
    }

    public void setKing(King king) {
        this.king = king;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public static class FactoryMaker{
        public static enum kingdomType{
            Lannisters,
            Targerian
        }

        public  static KingdomFactory makeFactory(kingdomType type) {
            return switch (type) {
                case Lannisters -> new RoyalKingdom();
                case Targerian -> new TargerianKingdom();

            };
        }
    }
}
