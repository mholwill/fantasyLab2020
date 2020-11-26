import characters.spellcasters.Wizard;
import creatures.Creature;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Wizard enemyWizard;
    Spell fireball;
    Creature cerberus;

    @Before
    public void before() {
        fireball = new Fireball();
        cerberus = new Creature("Cerbarus", 3);
        wizard = new Wizard(30, "Hades", cerberus, 5);
        enemyWizard = new Wizard(30, "Zagreus", cerberus, 5);

        wizard.addSpell(fireball);
    }

    @Test
    public void canDefend() {
        wizard.defend(10);
        assertEquals(23, wizard.getCurrentHealth());
    }

    @Test
    public void canAttack() {
        wizard.attack(enemyWizard);
        assertEquals(23, enemyWizard.getCurrentHealth());
    }

}
