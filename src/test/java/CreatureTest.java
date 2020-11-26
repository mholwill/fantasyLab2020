import creatures.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature creature;

    @Before
    public void before() {
        creature = new Creature("Dragon", 4);
    }

    @Test
    public void canGetName(){
        assertEquals("Dragon", creature.getName());
    }

    @Test
    public void canSetName(){
        creature.setName("Ogre");
        assertEquals("Ogre", creature.getName());
    }

    @Test
    public void canGetDefense(){
        assertEquals(4, creature.getDefense());
    }

    @Test
    public void canSetDefense(){
        creature.setDefense(5);
        assertEquals(5, creature.getDefense());
    }

}
