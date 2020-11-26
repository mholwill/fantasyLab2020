import characters.Dwarf;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;
    Sword sword;


    @Before
    public void before(){
        sword = new Sword();
        axe = new Axe();
        dwarf = new Dwarf(30, "Harrison", axe, 5);
    }

    @Test
    public void canAddWeapon(){
        dwarf.addWeapon(sword);
        assertEquals(2, dwarf.getInventory().size());
    }

    @Test
    public void canChangeWeapons(){
        dwarf.addWeapon(sword);
        dwarf.changeWeapon(1);
        assertEquals(sword, dwarf.getActiveWeapon());
    }

    


}
