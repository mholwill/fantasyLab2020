import characters.Player;
import characters.PlayerImpl;
import org.junit.Before;
import org.junit.Test;
import tools.HealingTool;

import static org.junit.Assert.assertEquals;

public class HealingtToolTest {

    HealingTool tool;
    Player player;

    @Before
    public void before(){
        tool = new HealingTool(3);
        player = new PlayerImpl(10, "Graham");
    }

    @Test
    public void canHeal() {
        player.setCurrentHealth(5);
        tool.apply(player);
        assertEquals(8, player.getCurrentHealth());
    }

}
