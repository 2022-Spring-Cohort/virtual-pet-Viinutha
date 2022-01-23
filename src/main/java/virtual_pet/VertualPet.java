package virtual_pet;

public class VertualPet {
    private String petName;
    private String petType;
    private String breed;
    private int hungry;
    private int thirsty;

    public VertualPet(String petName, String petType, String breed, int hungry, int thirsty) {
        this.petName = petName;
        this.petType = petType;
        this.breed = breed;
        this.hungry = hungry;
        this.thirsty = thirsty;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public String getBreed() {
        return breed;
    }

    public int getHungry() {
        return hungry;
    }

    public int getThirsty() {
        return thirsty;
    }

    public String hungerStatus(int hungerSatisfaction){

        if (hungerSatisfaction <= 50 && hungerSatisfaction > 0) {
            return "I am satisfied :-)";
       }
       else if (hungerSatisfaction > 50){
           return "i am starving :-(";
       }
       else if(hungerSatisfaction == 0) {
            return "I am dead";
        }
       return "";
    }
    public void tick() {

        hungry = Math.max(0, hungry + 5);
        thirsty = Math.max(0, thirsty + 5);
    }

    public void feedFood(int feedingLevel){
        if(hungry - feedingLevel > 0) {
            hungry -= feedingLevel;
        }
    }
    public void feedLiquid(int liquid){
        if(thirsty - liquid > 0) {
            thirsty -= liquid;
        }
       }
    public void walk(){
        hungry++;
    }
}
