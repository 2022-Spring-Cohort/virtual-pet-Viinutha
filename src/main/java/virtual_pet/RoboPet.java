package virtual_pet;

public abstract  class RoboPet extends VirtualPet{
    protected int oil;
    protected int maintenance;

    public RoboPet(String petName, String petType,int boredom, String petKind,int oil,int maintenance) {
        super(petName, petType, boredom, petKind);
        this.maintenance = maintenance;
        this.oil = oil;

    }

    @Override
    public String hungerStatus() {
        if (oil <= 50 && oil > 0) {
            return "My oil is good :-)";
        } else if (oil > 50) {
            return "my oil level is low please feed oil:-(";
        } else if (oil <= 0) {
            return "I am out of oil";
        }
        return "";
    }
    @Override
    public void tick() {
        oil += 5;
        maintenance += 5;
        boredom += 5;
    }

    @Override
    public void feed(int feedAmount) {
        if(oil - feedAmount > 0){
            oil -= feedAmount;
        }

    }
    public String maintainenceStatus(){
        if(maintenance > 50 && maintenance < 100){
           return "my maintainence is reaaly bad take me for maintainence";
        }
        else if (maintenance <= 50 && maintenance > 0){
            return "I am very well maintained thank you  :-)";
        }
        return null;

    }

}
