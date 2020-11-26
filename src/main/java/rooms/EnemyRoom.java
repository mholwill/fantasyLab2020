package rooms;

import characters.IFight;
import characters.Party;
import characters.supports.Support;

import java.util.ArrayList;
import java.util.Random;

public class EnemyRoom extends Room {
    private ArrayList<IFight> enemies;

    public EnemyRoom(String name) {
        super(name);
        this.enemies = new ArrayList<IFight>();
    }

    public void addEnemy(IFight enemy){
        enemies.add(enemy);
    }

    public int countEnemies(){
        return enemies.size();
    }

    public boolean play(Party party) {
        while(enemies.size() > 0 && party.getPlayers().size() > 0) {
            party.performSupport();
            // loop through party player, each player attacks random enemy
            for (IFight player : party.getPlayers()) {
                int randomEnemyIndex = new Random().nextInt(enemies.size());
                player.attack(enemies.get(randomEnemyIndex));
                if (enemies.get(randomEnemyIndex).getCurrentHealth() <= 0) {
                    enemies.remove(randomEnemyIndex);
                    if (enemies.size() == 0) {
                        return true;
                    }
                }
            }
            // loop through enemies, each enemy attacks random player
            for (IFight enemy : enemies) {
                int randomPlayerIndex = new Random().nextInt(party.getPlayers().size());
                enemy.attack(party.getPlayers().get(randomPlayerIndex));
                if (party.getPlayers().get(randomPlayerIndex).getCurrentHealth() <= 0) {
                    party.removePlayer(randomPlayerIndex);
                    if (party.getPlayers().size() == 0) {
                        return false;
                    }
                }
            }
        }
        return party.getPlayers().size() > 0;
    }
}
