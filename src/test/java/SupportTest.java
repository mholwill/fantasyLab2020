import characters.fighters.Dwarf;
import characters.supports.Support;
import org.junit.Before;
import org.junit.Test;
import tools.HealingTool;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SupportTest {
    Sword sword;
    Dwarf dwarf;
    HealingTool healingTool;
    Support cleric;

    @Before
    public void before() {
        sword = new Sword();
        dwarf = new Dwarf(30, "Eugene", sword, 0);
        healingTool = new HealingTool(3);
        cleric = new Support("Cleric", healingTool);
    }

    @Test
    public void testCanUseTool() {
        dwarf.setCurrentHealth(10);
        cleric.support(dwarf);
        assertEquals(13, dwarf.getCurrentHealth());
    }
}
