package characters;

import creatures.Creature;

import java.util.Random;

public class Warlock extends Spellcaster {
    private int critChance;
    private int critMultiplier;

    public Warlock(int maxHealth, String name, Creature pet, int critChance, int critMultiplier) {
        super(maxHealth, name, pet);
        this.critChance = critChance;
        this.critMultiplier = critMultiplier;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getCritMultiplier() {
        return critMultiplier;
    }

    public void setCritMultiplier(int critMultiplier) {
        this.critMultiplier = critMultiplier;
    }

    public void attack(IFight opponent) {
        int randomNumber = new Random().nextInt(100) + 1;
        int damage = getSpellDamage();
        if (randomNumber <= critChance) {
            damage *= critMultiplier;
        }
        opponent.defend(damage);
    }
}
