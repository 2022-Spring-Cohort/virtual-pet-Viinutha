package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    VertualPet underTest;
    @BeforeEach
    public void setup(){
        underTest = new VertualPet("Mochi","small Dog",30);
    }

    @Test
    public void petShouldHaveFeilds(){
        assertEquals("Mochi",underTest.getPetName());
        assertEquals("small Dog",underTest.getPetType());
        assertEquals(30,underTest.getHungry());
    }
    @Test
    public void tickTest(){
        underTest.tick();
        assertEquals(35,underTest.getHungry());
        assertEquals(5,underTest.getBored());
    }
    @Test
    public void feedFoodTest(){
        underTest.feedFood(10);
        assertEquals(20,underTest.getHungry());
    }
    @Test
    public void walkTest(){
        underTest.walk();
        assertEquals(40,underTest.getHungry());
    }
    @Test
    public void hungerStatusTest(){
        underTest.hungerStatus();
        assertEquals("I am satisfied :-)",underTest.hungerStatus());
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        assertEquals("I am starving :-(",underTest.hungerStatus());
        underTest.feedFood(55);
        assertEquals("I am dead",underTest.hungerStatus());
    }
    @Test
    public void healthStatusTest(){
        underTest = new VertualPet("Mochi","small Dog",90);
        underTest.healthStatus();
        assertEquals("my health status is bad",underTest.healthStatus());
        underTest.walk();
        assertEquals("my health status is bad",underTest.healthStatus());
        underTest.feedFood(60);
        assertEquals("my health is good",underTest.healthStatus());
    }

    @Test
    public void boredomStatusTest(){
        underTest.tick();
        assertEquals("I am not bored",underTest.boredomStatus());
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        underTest.tick();
        assertEquals("I am bored please take me to walk",underTest.boredomStatus());
    }
}

