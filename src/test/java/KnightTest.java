<<<<<<< HEAD
import characters.fighters.Dwarf;
import characters.fighters.Knight;
=======
import characters.Dwarf;
>>>>>>> 8df393e50170264187aa849889967cfe4dec52f1
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    Dwarf dwarf;

    @Before
    public void before(){
        sword = new Sword();
        knight = new Knight(30, "Hannah", sword, 5);
        dwarf = new Dwarf(30, "Chris", sword, 0);
    }

    @Test
    public void canDefend(){
        knight.defend(10);
        assertEquals(25, knight.getCurrentHealth());
    }

    @Test
    public void canAttack(){
        knight.attack(dwarf);
        assertEquals(27, dwarf.getCurrentHealth());
    }

}
