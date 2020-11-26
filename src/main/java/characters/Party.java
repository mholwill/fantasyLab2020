package characters;

import characters.fighters.Dwarf;
import characters.supports.Support;
import rooms.Treasure;

import java.util.ArrayList;

public class Party {
    private ArrayList<IFight> players;
    private ArrayList<Support> supports;
    private ArrayList<Treasure> riches;

    public Party() {
        this.players = new ArrayList<IFight>();
        this.supports = new ArrayList<Support>();
        this.riches = new ArrayList<Treasure>();
    }

    public ArrayList<IFight> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<IFight> players) {
        this.players = players;
    }

    public ArrayList<Support> getSupports() {
        return supports;
    }

    public void setSupports(ArrayList<Support> supports) {
        this.supports = supports;
    }

    public ArrayList<Treasure> getRiches() {
        return riches;
    }

    public void setRiches(ArrayList<Treasure> riches) {
        this.riches = riches;
    }

    public void addToRiches(Treasure treasure) {
        this.riches.add(treasure);
    }

    public int getTotalRichesValue() {
        int total = 0;
        for (Treasure treasure : riches) {
            total += treasure.getValue();
        }
        return total;
    }

    public void addPlayer(IFight player) {
        players.add(player);
    }

    public void addSupport(Support support) {
        supports.add(support);
    }

    public void performSupport() {
        for (Support support : supports) {
            for (IFight player : players) {
                support.support(player);
            }
        }
    }

    public void removePlayer(int index) {
        players.remove(index);
    }
}
