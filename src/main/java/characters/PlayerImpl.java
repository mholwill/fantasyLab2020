package characters;

public class PlayerImpl extends Player {
    public PlayerImpl(int maxHealth, String name) {
        super(maxHealth, name);
    }

    public void attack(IFight opponent) {
        opponent.defend(0);
    }
}
