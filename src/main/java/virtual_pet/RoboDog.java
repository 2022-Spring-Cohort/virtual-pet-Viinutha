package virtual_pet;

public  class RoboDog extends RoboPet implements Petwalkable{


    public RoboDog(String petName, String petType, int boredom, String petKind, int oil, int maintenance) {
        super(petName, petType, boredom, petKind, oil, maintenance);
    }


    @Override
    public void walk() {
        oil += 5;
        maintenance += 5;
        if(boredom - 50 > 0){
            boredom -= 50;
        }
        else if (boredom -50 < 0){
            boredom = 0;
        }
    }

    @Override
    public String toString() {
        return
                "oil=" + oil +
                ", maintenance=" + maintenance +
                ", petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                ", boredom=" + boredom +
                ", petKind='" + petKind + '\'';
    }

}
