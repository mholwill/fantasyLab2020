package characters;

import weapons.Weapon;

public class Knight extends Fighter {

    private int armour;

    public Knight(int maxHealth, String name, Weapon activeWeapon, int armour) {
        super(maxHealth, name, activeWeapon);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    @Override
    public void defend(int damage) {
        super.defend(damage - armour);
    }
}
