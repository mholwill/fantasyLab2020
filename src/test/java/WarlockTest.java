import characters.spellcasters.Warlock;
import characters.spellcasters.Wizard;
import creatures.Creature;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Wizard enemyWizard;
    Spell fireball;
    Creature cerberus;

    @Before
    public void before() {
        fireball = new Fireball();
        cerberus = new Creature("Cerbarus", 3);
        warlock = new Warlock(30, "Hades", cerberus, 100, 2);
        enemyWizard = new Wizard(30, "Zagreus", cerberus, 5);

        warlock.addSpell(fireball);
    }

    @Test
    public void canAttack() {
        warlock.attack(enemyWizard);
        assertEquals(23, enemyWizard.getCurrentHealth());
    }

}
