package characters.fighters;

import characters.IFight;
import characters.Player;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private Weapon activeWeapon;
    private ArrayList<Weapon> inventory;

    public Fighter(int maxHealth, String name, Weapon activeWeapon) {
        super(maxHealth, name);
        this.activeWeapon = activeWeapon;
        this.inventory = new ArrayList<Weapon>();
        this.inventory.add(activeWeapon);
    }


    public Weapon getActiveWeapon() {
        return activeWeapon;
    }

    public void setActiveWeapon(Weapon activeWeapon) {
        this.activeWeapon = activeWeapon;
    }

    public ArrayList<Weapon> getInventory() {
        return inventory;
    }

    public void addWeapon(Weapon weapon) {
        this.inventory.add(weapon);
    }

    public void changeWeapon(int index){
        this.activeWeapon = this.inventory.get(index);
    }

    public void attack(IFight opponent){
        opponent.defend(this.activeWeapon.getDamage());
    }
}
