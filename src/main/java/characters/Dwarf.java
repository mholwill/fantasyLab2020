package characters;

import weapons.Weapon;

public class Dwarf extends Fighter{

    private int bonusDamage;

    public Dwarf(int maxHealth, String name, Weapon activeWeapon, int bonusDamage) {
        super(maxHealth, name, activeWeapon);
        this.bonusDamage = bonusDamage;
    }

    public int getBonusDamage() {
        return bonusDamage;
    }

    public void setBonusDamage(int bonusDamage) {
        this.bonusDamage = bonusDamage;
    }


}
