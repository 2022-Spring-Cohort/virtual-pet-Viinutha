package virtual_pet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertAll;

public class VirtualPetTest {

    @Test
    public void hungerStatusTest(){
        VertualPet vp = new VertualPet("boll","dog","lan",25,30);
        assertAll(
                ()->Assert.assertTrue(vp.hungerStatus(70).equals("i am hungry :-(")),
                ()->Assert.assertTrue(vp.hungerStatus(25).equals("I am satisfied :-)")),
                ()->Assert.assertTrue(vp.hungerStatus(0).equals("I am dead"))
        );
    }
    @Test
    public void tickTest(){
        VertualPet vp = new VertualPet("boll","dog","lan",25,45);
        vp.tick();
        assertAll(
                ()->Assert.assertTrue(vp.getHungry() == 30),
                ()->Assert.assertTrue(vp.getThirsty() == 50)
        );
    }
    @Test
    public void feedFoodTest(){
        VertualPet vp = new VertualPet("boll","dog","lan",25,45);

        vp.feedFood(30);
        vp.feedLiquid(20);
        assertAll(

                ()->Assert.assertTrue(vp.getHungry() == 25),
                ()->Assert.assertTrue(vp.getThirsty() == 25)
        );
        vp.feedFood(5);
        vp.feedLiquid(10);
        assertAll(

                ()->Assert.assertTrue(vp.getHungry() == 20),
                ()->Assert.assertTrue(vp.getThirsty() == 15)
        );

    }

}
