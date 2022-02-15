package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter{
    public ArrayList<VirtualPet> getPetsList() {
        return petsList;
    }

    private ArrayList<VirtualPet> petsList = new ArrayList<>();
   // private HashMap<Integer,VirtualPet> petsList = new HashMap<Integer, VirtualPet>();
    Scanner input = new Scanner(System.in);
    Integer i = 1;
    public void listPrinter(){
        int i = 1;
        for (VirtualPet vp:petsList
             ) {
            System.out.println(vp.toString().toUpperCase());
        }
    }
    public void admit(VirtualPet pet){
        petsList.add(pet);
    }
    public void adopt(){
        adpotingPet(petselector());
        listPrinter();
    }
    public void adpotingPet(VirtualPet vp){
        petsList.remove(vp);
    }
    public void statusCheckindividual(VirtualPet vp){
        if(vp instanceof OrganicPet){
            System.out.println("STATUS OF :"+vp.petName.toUpperCase()+" IS :"+vp.boredomStatus(vp.boredom)+", "+((OrganicPet) vp).hungerStatus());
        }
        else  if (vp instanceof RoboPet){
            System.out.println("STATUS OF :"+vp.petName.toUpperCase()+" IS :"+vp.boredomStatus(vp.boredom)+", "+((RoboPet) vp).hungerStatus()+" "+((RoboPet) vp).maintainenceStatus());
        }
    }
    public void status(){
        for (VirtualPet vp:petsList) {
            statusCheckindividual(vp);
        }
    }
    public void feed(){
        System.out.println("please the enter the quantity to be feed");
        int feedAmount = input.nextInt();
        input.nextLine();
        for (VirtualPet vp:petsList) {
            feedIndividual(vp,feedAmount);
        }
    }
    public void tick(){
        for (VirtualPet vp:petsList
             ) {
            if(vp instanceof OrganicDog){
                vp = (OrganicDog)vp;
                vp.tick();
            }
            else if(vp instanceof OrganicCat){
                vp = (OrganicCat)vp;
                vp.tick();
            }
            else if(vp instanceof RoboPet){
                vp = (RoboPet)vp;
                vp.tick();
            }
        }
    }
    public void feedIndividual(VirtualPet vp,int feedAmount) {
        if(vp instanceof OrganicPet){
            vp.feed(feedAmount);
        }
        else if (vp instanceof RoboPet){
            vp.feed(feedAmount);
        }
    }
    public void walkIndividualPet(VirtualPet vp) {

            if(vp instanceof OrganicDog){
                ((OrganicDog) vp).walk();
            }
            else if (vp instanceof OrganicCat){
                ((OrganicCat) vp).walk();
            }
            else if (vp instanceof RoboCat){
                ((RoboCat) vp).walk();
            }
            else if(vp instanceof RoboDog){
                ((RoboDog) vp).walk();
            }
        }
        public void walk(){
            for (VirtualPet vp:petsList) {
                walkIndividualPet(vp);
            }
        }

    public void feedInvidualPet() {
        VirtualPet vp1 = petselector();
        System.out.println("enter quantity to be feed in number".toUpperCase());
        int feedAmount = input.nextInt();
        feedIndividual(vp1,feedAmount);
    }

    public void maintainenceCheck() {
        for (VirtualPet vp:petsList
             ) {
            if(vp instanceof RoboPet){
                ((RoboPet) vp).maintenance = 0;
            }
        }
    }
    public boolean listChecker(String name){
        VirtualPet vp1 = null;
        for (VirtualPet vp : petsList) {
            if (name.equalsIgnoreCase(vp.petName)) {
                return true;
            }
        }
        return false;
    }
    public void maintainenceCheckIndividual(){
        VirtualPet vp = petselector();
        if(vp instanceof RoboPet)
        ((RoboPet) vp).maintenance = 0;
    }
    public VirtualPet petselector(){
        System.out.println("please select from list:");
        listPrinter();
        String name = input.nextLine();
        VirtualPet vp1 = null;
        for (VirtualPet vp : petsList) {
            if (name.equalsIgnoreCase(vp.petName)) {
                vp1 = vp;
            }
        }
        return vp1;
    }
    public void walkIndividualPetFromList() {
        walkPet(petselector());
    }
    public void walkPet(VirtualPet vp){
        walkIndividualPet(vp);
    }
}

