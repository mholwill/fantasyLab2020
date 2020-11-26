package characters;

public interface IFight {

    void attack(IFight opponent);
    void defend(int damage);
    void heal(int healAmount);
    int getCurrentHealth();

}
