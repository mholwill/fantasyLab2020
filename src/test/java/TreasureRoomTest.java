import characters.Party;
import org.junit.Before;
import org.junit.Test;
import rooms.Treasure;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {
    Party party;
    Treasure treasure;
    TreasureRoom treasureRoom;

    @Before
    public void before() {
        party = new Party();
        treasure = new Treasure("Gold", 20);
        treasureRoom = new TreasureRoom("Castle Gold Reserves", treasure);
    }

    @Test
    public void canPlayRoom() {
        treasureRoom.play(party);
        assertEquals(20, party.getTotalRichesValue());
    }

}
