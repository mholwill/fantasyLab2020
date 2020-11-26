import characters.Party;
import characters.fighters.Dwarf;
import characters.supports.Support;
import org.junit.Before;
import org.junit.Test;
import rooms.Treasure;
import tools.HealingTool;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class PartyTest {
    Party party;
    Treasure treasure;
    Support cleric;
    Dwarf dwarf;

    @Before
    public void before() {
        party = new Party();
        treasure = new Treasure("Gold", 20);
        dwarf = new Dwarf(30, "Dwarf", new Sword(), 0);
        cleric = new Support("Support", new HealingTool(0));
    }

    @Test
    public void canAddPlayer() {
        party.addPlayer(dwarf);
        assertEquals(1, party.getPlayers().size());
    }

    @Test
    public void canAddSupport() {
        party.addSupport(cleric);
        assertEquals(1, party.getSupports().size());
    }

    @Test
    public void canAddToRiches() {
        party.addToRiches(treasure);
        assertEquals(20, party.getTotalRichesValue());
    }
}
