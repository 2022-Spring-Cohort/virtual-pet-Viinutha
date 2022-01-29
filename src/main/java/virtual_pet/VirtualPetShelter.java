package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter{
    public ArrayList<VertualPet> petsList = new ArrayList<>();
    private ArrayList<VertualPet> admitList = new ArrayList<>();
    private ArrayList<VertualPet> adoptedList = new ArrayList<>();


    GamingLoop gp = new GamingLoop();
    Scanner input = new Scanner(System.in);

    public ArrayList<VertualPet> getAdmitList() {
        return admitList;
    }
    public ArrayList<VertualPet> getAdoptedList() {
        return adoptedList;
    }
    public void listPrinter(ArrayList<VertualPet> list){
        int i = 1;
        for (VertualPet vp : list
        ) {
            System.out.println(i+":"+"{MY NAME IS "
                    + vp.getPetName() +"\t I am a,"+vp.getPetType()+"\t AND BREED "+
                    "\t AND MY HUNGER LEVEL IS "+vp.getHungry()+" "+
                    "}");
            i++;
        }
    }
    public void listOfPetsAdmited() {
        System.out.println("LIST OF PETS ADMITTED :" );
        listPrinter(admitList);
    }
    public void listOfPetsAdopted(){
        System.out.println("LIST OF PETS ADOPTED :");
        listPrinter(adoptedList);
    }
    public VertualPet petsList(){
            //listPrinter(petsList);
            VertualPet vp1 = new VertualPet("buiscuit","dog",45);
            for (int i = 0; i < petsList.size();i++){
                if (petsList.get(i).healthStatus().equalsIgnoreCase("I am dead")){
                    petsList.remove(i);
                }
            }
            listPrinter(petsList);
            System.out.println("enter name from list.".toUpperCase());
            input.nextLine();
            String name = input.nextLine();
            for (VertualPet vp:petsList) {
                if(name.equalsIgnoreCase(vp.getPetName())) {
                   // System.out.println(name);
                    return vp;
                }
           }
            return  vp1;
    }
    public VertualPet inputListFromUser(){
        System.out.println("enter name of pet");
        String name = input.nextLine();
        System.out.println("enter pet type");
        String type = input.nextLine();
        System.out.println("enter the hunger level from 0 to 100");
        int hunger = input.nextInt();
        input.nextLine();
        VertualPet vp = new VertualPet(name,type,hunger);
        return  vp;
    }
    public void admit(){

        System.out.println("press 1 to select from list if your pet already in list  or press 2 give your inputs for new pet");
        int select = input.nextInt();

        if(select == 1) {
            VertualPet vp = petsList();
            System.out.println("you have selected "+vp.getPetName());
            admitList.add(vp);
            petsList.remove(vp);
            gp.gamingLoopActions(vp);
        }
        else if(select == 2) {
            input.nextLine();
            VertualPet vp = inputListFromUser();
            System.out.println("you have selected "+vp.getPetName());
            admitList.add(vp);
            gp.gamingLoopActions(vp);
        }
    }
    public void adopt(){
        System.out.println("PLEASE FROM THE LIST WHICH PET YOU WANT TO ADOPT");
        listOfPetsAdmited();
        String name = input.nextLine();
        for (VertualPet vp : admitList) {
            if (name.equalsIgnoreCase(vp.getPetName())) {
                admitList.remove(vp);
                adoptedList.add(vp);
            }
        }
    }
    public void statusCheckindividual(VertualPet vp){
        System.out.println("STATUS OF :"+vp.getPetName().toUpperCase()+" IS :"+vp.boredomStatus()+", "+vp.healthStatus()+", "+ vp.hungerStatus());
    }
    public void statusCheck(){
        for (VertualPet vp : admitList) {
            statusCheckindividual(vp);
        }
    }
    public void individualPetselectio(){
        System.out.println("please select name from list:");
       // adoptedList.get(0).getPetName();
        for (VertualPet vp:admitList) {
            System.out.println(vp.getPetName());
        }
        String name = input.nextLine();
        for (VertualPet vp:admitList) {
            if(name.equalsIgnoreCase(vp.getPetName())){
                System.out.println(vp.getPetName()+" is selected.");
                System.out.println("if you want to check status please of pet press 'status', if you want to interact press 'interact'. ".toUpperCase());
                String status = input.nextLine().toLowerCase();
                switch(status){
                    case "status":
                        statusCheckindividual(vp);
                        break;
                    case "interact":
                        gp.gamingLoopActions(vp);
                        break;
                }
            }
        }
    }
}
