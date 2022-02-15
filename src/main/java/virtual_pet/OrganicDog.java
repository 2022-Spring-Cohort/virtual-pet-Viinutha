package virtual_pet;

public class OrganicDog extends OrganicPet implements Petwalkable{

    protected int cageCleaning;

    public OrganicDog(String petName, String petType,int boredom, String petKind, int hunger,int cageCleaning) {
        super(petName, petType, boredom, petKind, hunger);
        this.cageCleaning = cageCleaning;
    }
    @Override
    public void tick() {
        hunger += 5;
        cageCleaning += 5;
        boredom += 5;
    }
    @Override
    public String toString() {
        return "cageCleaning=" + cageCleaning +
                ", hunger=" + hunger +
                ", petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                ", boredom=" + boredom +
                ", petKind='" + petKind + '\'';
    }
    @Override
    public void walk() {
        hunger += 5;
        if(cageCleaning - 5 > 0){
            cageCleaning -= 5;
        }
        else if(cageCleaning - 5 < 0){
            cageCleaning = 0;
        }
        if(boredom - 50 > 0){
            boredom -= 50;
        }
        else if (boredom -50 < 0){
            boredom = 0;
        }
    }
}
