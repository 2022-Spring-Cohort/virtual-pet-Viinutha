package virtual_pet;

import java.util.Scanner;

public class VertualPet {
    private String petName;
    private String petType;
    private int hungry;
    private boolean health;
    private int bored;
    Scanner input = new Scanner(System.in);

    public VertualPet(String petName, String petType, int hungry) {
        this.petName = petName;
        this.petType = petType;
        this.hungry = hungry;
        this.bored = 0;

    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public int getHungry() {
        return hungry;
    }

    public int getBored() {return bored;
    }
    public boolean isHealth() {
        return health;
    }
    public String hungerStatus() {
        if (hungry <= 50 && hungry > 0) {
            return "I am satisfied :-)";
        } else if (hungry > 50) {
            return "I am starving :-(";
        } else if (hungry <= 0) {
            return "I am dead";

        }
        return "";
    }
    public String boredomStatus() {
        if (bored > 50 && bored <= 100) {
            return "I am bored please take me to walk";
        }
        return  "I am not bored";

    }

    public void tick() {
        hungry += 5;
        bored += 5;
    }
    public void feedFood(int feedingLevel) {
        if (hungry - feedingLevel >= 0) {
            hungry -= feedingLevel;
        }
    }
    public void walk() {

        hungry += 10;
        bored -= 10;
    }
    public void boredom() {
        System.out.println("I am bored please tak eme to walk");
    }
    public String healthStatus(){
        if(getHungry() > 80 || getHungry() > 100){
            return "my health status is bad";
        }
        else if(getHungry() == 0)
            return  "I am dead";
        return "my health is good";

    }
    public void doctor() {
        health = true;
    }
}

