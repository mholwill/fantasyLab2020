package characters.spellcasters;

import characters.IFight;
import creatures.Creature;

public class Wizard extends Spellcaster {
    private int bonusDamage;

    public Wizard(int maxHealth, String name, Creature pet, int bonusDamage) {
        super(maxHealth, name, pet);
        this.bonusDamage = bonusDamage;
    }

    public int getBonusDamage() {
        return bonusDamage;
    }

    public void setBonusDamage(int bonusDamage) {
        this.bonusDamage = bonusDamage;
    }

    public void attack(IFight opponent) {
        int damage = getSpellDamage() + bonusDamage;
        opponent.defend(damage);
    }
}
