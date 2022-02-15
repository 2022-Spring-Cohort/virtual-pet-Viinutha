package virtual_pet;

public abstract class  OrganicPet extends VirtualPet{
    protected int hunger;
    public OrganicPet(String petName, String petType, int boredom,String petKind,int hunger) {
        super(petName, petType, boredom,petKind);
        this.hunger = hunger;
    }
    public String hungerStatus() {
        if (hunger <= 50 && hunger > 0) {
            return "I am satisfied :-)";
        } else if (hunger > 50) {
            return "I am starving :-(";
        } else if (hunger <= 0) {
            return "I am dead";
        }
        return "";
    }

    @Override
    public void feed(int feedAmount) {
        if(hunger - feedAmount >0){
            hunger -= feedAmount;
        }
    }



}

