import characters.IFight;
import org.junit.Before;
import org.junit.Test;

import rooms.EnemyRoom;
import characters.Party;
import characters.fighters.Dwarf;
import characters.fighters.Knight;
import weapons.Axe;
import weapons.Sword;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;

    Party party;
    Knight knight;
    Dwarf dwarf;

    Dwarf enemyDwarf;
    Knight enemyKnight;

    @Before
    public void before(){

        party = new Party();
        dwarf = new Dwarf(30, "Dwarf", new Axe(), 100);
        knight = new Knight(30, "Knight", new Sword(), 2);
        party.addPlayer(dwarf);
        party.addPlayer(knight);

        enemyDwarf = new Dwarf(3000, "badDwarf", new Axe(), 100);
        enemyKnight = new Knight(30, "badKnight", new Sword(), 0);

        enemyRoom = new EnemyRoom("Castle Ruins");


    }

    @Test
    public void canCountEnemies(){
        enemyRoom.addEnemy(enemyDwarf);
        enemyRoom.addEnemy(enemyKnight);
        assertEquals(2, enemyRoom.countEnemies());
    }

    @Test
    public void canDefeatEnemies(){
        enemyKnight.setCurrentHealth(1);
        enemyRoom.addEnemy(enemyKnight);
        assertEquals(true, enemyRoom.play(party));
    }

    @Test
    public void canBeGameOver(){
        enemyRoom.addEnemy(enemyDwarf);
        assertEquals(false, enemyRoom.play(party));
    }
}
