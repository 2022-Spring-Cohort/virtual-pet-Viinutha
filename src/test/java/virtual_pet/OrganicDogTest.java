package virtual_pet;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class OrganicDogTest {
    OrganicDog underTest;
    @BeforeEach
    public void setup(){
        underTest = new OrganicDog("Mochi","small Dog",30,"organic",55,25);
    }

    @Test
    public void petShouldHaveFeilds(){
        assertEquals("Mochi",underTest.petName);
        assertEquals("small Dog",underTest.petType);
        assertEquals(30,underTest.boredom);
        assertEquals("organic",underTest.petKind);
        assertEquals(55,underTest.hunger);
        assertEquals(25,underTest.cageCleaning);
    }
    @Test
    public void tickTest(){
        underTest.tick();
        assertEquals(35,underTest.boredom);
        assertEquals(60,underTest.hunger);
        assertEquals(30,underTest.cageCleaning);
        assertEquals(35,underTest.boredom);
    }
    @Test
    public void walkTest(){
        underTest.walk();
        assertEquals(60,underTest.hunger);
        assertEquals(20,underTest.cageCleaning);
        assertEquals(0,underTest.boredom);
    }


    }

