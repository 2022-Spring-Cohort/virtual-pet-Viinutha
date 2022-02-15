package virtual_pet;

public abstract class  VirtualPet {
    protected String petName;
    protected String petType;
    protected int boredom;
    protected String petKind;

    public VirtualPet(String petName, String petType, int boredom, String petKind) {
        this.petName = petName;
        this.petType = petType;
        this.boredom = boredom;
        this.petKind = petKind;
    }

    public abstract String hungerStatus();
    public abstract void tick();
    public abstract void feed(int feedAmount);

    public String boredomStatus(int bored)
    {
        if (bored > 50 && bored <= 100) {
            return "I am bored please take me to walk";
        }
        return  "I am not bored";
    }
    public void boredom()
    {

        System.out.println("I am bored please tak eme to walk");
    }
    public String healthStatus(int hunger)
    {
        if(hunger > 80 || hunger > 100){
            return "my health status is bad";
        }
        else if(hunger == 0)
            return  "I am dead";
        return "my health is good";
    }
}

