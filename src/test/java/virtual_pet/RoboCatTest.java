package virtual_pet;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class RoboCatTest {
    RoboCat underTest;
    @BeforeEach
    public void setup(){
        underTest = new RoboCat("Mochi","cat",30,"robot",55,40);
    }
    @Test
    public void petShouldHaveFeilds(){
        assertEquals("Mochi",underTest.petName);
        assertEquals("cat",underTest.petType);
        assertEquals(30,underTest.boredom);
        assertEquals("robot",underTest.petKind);
        assertEquals(55,underTest.oil);
        assertEquals(40,underTest.maintenance);
    }
    @Test
    public void tickTest(){
        underTest.tick();
        assertEquals(35,underTest.boredom);
        assertEquals(60,underTest.oil);
        assertEquals(45,underTest.maintenance);
    }
    @Test
    public void walkTest(){
        underTest.walk();
        assertEquals(60,underTest.oil);
        assertEquals(45,underTest.maintenance);
        assertEquals(0,underTest.boredom);
    }
}


