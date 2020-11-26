package tools;

import characters.IFight;
import characters.Player;

public class HealingTool implements ITool {
    int healingAmount;

    public HealingTool(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public void apply(IFight target) {
        target.heal(healingAmount);
    }
}
