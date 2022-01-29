package virtual_pet;
/*
Our pets are housed in a shelter and cared for by you. You can interact with one pet at a time, or all pets. They can be adopted.

Virtual Toys, Inc. requires:

Ability for players to admit pets into the shelter or adopt them
Ability for players to see a list of all pets in the shelter
Ability for players to see the current status of all pets at once, such as hunger, boredom, and health
Ability for players to choose to interact with one pet or multiple pets, such as feed, play, and take to doctor
 */

import java.util.Scanner;
public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter vps = new VirtualPetShelter();
        GamingLoop gp = new GamingLoop();
        boolean status = true;
        VertualPet vp1 = new VertualPet("Buiscuit","Dog",45);
        VertualPet vp2 = new VertualPet("Tommy","Cat",15);
        VertualPet vp3 = new VertualPet("colten","Dog",5);
        VertualPet vp4 = new VertualPet("Tinku","Cat",65);
        VertualPet vp5 = new VertualPet("camel","iguana",15);
        vps.petsList.add(vp1);
        vps.petsList.add(vp2);
        vps.petsList.add(vp3);
        vps.petsList.add(vp4);
        vps.petsList.add(vp5);
        while (status) {

                System.out.println("WOULD YOU LIKE TO 'ADMIT' OR 'ADOPT' A PET ?    ");
               // input.nextLine();
                String userChoice = input.nextLine();
                if(userChoice.equalsIgnoreCase("admit")){
                    vps.admit();
                }
                else if(userChoice.equalsIgnoreCase("adopt")){
                    vps.adopt();
                }
                vps.listOfPetsAdmited();
                System.out.println("ENTER STOP TO 'STOP' APPLICATION ANY TIME.");
                String command = input.nextLine();
                if(command.equalsIgnoreCase("stop")){
                    break;
                }
                System.out.println(" \n");
                System.out.println("ENTER STATUS TO CHECK FOR STATUS");
                String  allStatus= input.nextLine();
                if(allStatus.equalsIgnoreCase("status")){
                    vps.statusCheck();
                }
                System.out.println("would you like to select single pet at a time from the list for press 1 ");
                int choice = input.nextInt();
                input.nextLine();
                if(choice == 1){
                    vps.individualPetselectio();
                }
            }
    }
}

