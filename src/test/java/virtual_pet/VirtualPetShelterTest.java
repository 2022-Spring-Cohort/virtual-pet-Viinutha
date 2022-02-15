package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class VirtualPetShelterTest {
    VirtualPetShelter underTest;
    OrganicPet od1 = new OrganicDog("Biscuit", "Dog", 15, "organic", 60, 12);
    RoboPet rd1 = new RoboDog("Tiff", "dog", 20, "robot", 65, 20);
    OrganicCat oc1 = new OrganicCat("tommy", "cat", 20, "organic", 20, 15);
    OrganicPet od2 = new OrganicDog("Finn", "dog", 90, "organic", 45, 14);
    RoboCat rc1 = new RoboCat("Tommy", "cat", 58, "robot", 45, 12);
    @BeforeEach
    public void setup(){
        underTest = new VirtualPetShelter();

    }
    @Test
    public void admitTest(){
        underTest.admit(od1);
        assertEquals(od1,underTest.getPetsList().get(0));
    }
    @Test
    public void adoptTest(){
        underTest.admit(od1);
        underTest.admit(od2);
        assertEquals(od1,underTest.getPetsList().get(0));
        assertEquals(od2,underTest.getPetsList().get(1));
        assertEquals(2,underTest.getPetsList().size());
        underTest.adpotingPet(od2);
        assertEquals(1,underTest.getPetsList().size());
    }
    @Test
    public void feedIndividualPetTest(){
        underTest.admit(od1);
        underTest.admit(od2);
        underTest.feedIndividual(od1,10);
        assertEquals(50,od1.hunger);
    }
}
