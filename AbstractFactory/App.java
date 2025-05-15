package Low_level_design.AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static final Kingdom kingdom = new Kingdom();

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the name of the Kingdom (Lannisters / Targerian):");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        createKingDom(input);

        System.out.println("King: " + kingdom.getKing().getDescription());
        System.out.println("Castle: " + kingdom.getCastle().getDescription());
        System.out.println("Army: " + kingdom.getArmy().getDescription());
    }

    private static void createKingDom(String input) {
        Kingdom.FactoryMaker.kingdomType type;
        if (input.equalsIgnoreCase("Lannisters")) {
            type = Kingdom.FactoryMaker.kingdomType.Lannisters;
        } else if (input.equalsIgnoreCase("Targerian")) {
            type = Kingdom.FactoryMaker.kingdomType.Targerian;
        } else {
            System.out.println("Invalid Kingdom type entered.");
            return;
        }

        KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(type);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
    }
}
