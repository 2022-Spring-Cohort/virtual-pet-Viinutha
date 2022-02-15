package virtual_pet;

public class OrganicCat extends OrganicPet implements Petwalkable{

    protected int litterBox;

    public OrganicCat(String petName, String petType, int boredom, String petKind, int hunger,int litterBox) {
        super(petName, petType, boredom, petKind, hunger);
        this.litterBox = litterBox;
    }


    @Override
    public void tick() {
        hunger += 5;
        litterBox += 5;
        boredom += 5;
    }

    @Override
    public String toString() {
        return
                "litterBox=" + litterBox +
                ", hunger=" + hunger +
                ", petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                ", boredom=" + boredom +
                ", petKind='" + petKind + '\'';
    }

    @Override
    public void walk() {
        hunger += 5;
        if(litterBox - 5> 0)
        litterBox -= 5;
        if(boredom - 50 > 0)
        boredom -= 50;
        else if(boredom - 50 < 0){
            boredom = 0;
        }
    }
}

