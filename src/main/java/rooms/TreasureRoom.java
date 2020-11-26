package rooms;

import characters.Party;

public class TreasureRoom extends Room {
    private Treasure treasure;

    public TreasureRoom(String name, Treasure treasure) {
        super(name);
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public boolean play(Party party) {
        party.addToRiches(treasure);
        return true;
    }
}
