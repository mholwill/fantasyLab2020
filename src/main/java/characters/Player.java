package characters;

public abstract class Player implements IHealable {
    private int maxHealth;
    private int currentHealth;
    private String name;

    public Player(int maxHealth, String name) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void heal(int amount) {
        currentHealth += amount;
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
