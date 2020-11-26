import characters.Player;
import characters.PlayerImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;

    @Before
    public void before() {
        player = new PlayerImpl(30, "Malcolm James Holwill II");
    }

    @Test
    public void canHeal() {
        player.setCurrentHealth(1);
        player.heal(5);
        assertEquals(6, player.getCurrentHealth());
    }

    @Test
    public void cantHealPastMax() {
        player.heal(5);
        assertEquals(30, player.getCurrentHealth());
    }
}
