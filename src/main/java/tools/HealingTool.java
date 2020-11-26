package tools;

import characters.Player;

public class HealingTool implements ITool {
    int healingAmount;

    public HealingTool(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public void apply(Player target) {
        target.heal(healingAmount);
    }
}
