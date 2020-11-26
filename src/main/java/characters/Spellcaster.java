package characters;

import creatures.Creature;
import spells.Spell;

import java.util.ArrayList;
import java.util.Random;

public abstract class Spellcaster extends Player implements IFight {
    private ArrayList<Spell> spells;
    private Creature pet;

    public Spellcaster(int maxHealth, String name, Creature pet) {
        super(maxHealth, name);
        this.spells = new ArrayList<Spell>();
        this.pet = pet;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public Creature getPet() {
        return pet;
    }

    public void setPet(Creature pet) {
        this.pet = pet;
    }

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }

    public Spell getRandomSpell() {
        int randomSpellIndex = new Random().nextInt(spells.size());
        return spells.get(randomSpellIndex);
    }

    public int getSpellDamage() {
        return getRandomSpell().getPower();
    }

    public void attack(IFight opponent){
        int damage = getSpellDamage();
        opponent.defend(damage);
    }

    public void defend(int damage) {
        int netDamage = damage - this.pet.getDefense();
        setCurrentHealth(getCurrentHealth() - netDamage);
    }
}
