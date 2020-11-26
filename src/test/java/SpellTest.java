import org.junit.Before;
import org.junit.Test;
import spells.Fireball;
import spells.LightningBolt;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Spell fireball;

    @Before
    public void before() {
        fireball = new Fireball();
    }

    @Test
    public void canGetPower() {
        assertEquals(5, fireball.getPower());
    }

    @Test
    public void canGetDifferentPower() {
        Spell lightningBolt = new LightningBolt();
        assertEquals(2, lightningBolt.getPower());
    }

    @Test
    public void canSetPower() {
        fireball.setPower(6);
        assertEquals(6, fireball.getPower());
    }
}
