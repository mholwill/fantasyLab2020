import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Weapon sword;

    @Before
    public void before() {
        sword = new Sword();
    }

    @Test
    public void canGetPower() {
        assertEquals(3, sword.getDamage());
    }

    @Test
    public void canGetDifferentPower() {
        Weapon axe = new Axe();
        assertEquals(5, axe.getDamage());
    }

    @Test
    public void canSetPower() {
        sword.setDamage(6);
        assertEquals(6, sword.getDamage());
    }
}
