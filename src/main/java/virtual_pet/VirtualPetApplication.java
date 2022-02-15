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
        boolean status = true;
        OrganicPet od1 = new OrganicDog("Biscuit", "Dog", 15, "organic", 60, 12);
        RoboPet rd1 = new RoboDog("Tiff", "dog", 20, "robot", 65, 20);
        OrganicCat oc1 = new OrganicCat("tommy", "cat", 20, "organic", 20, 15);
        OrganicPet od2 = new OrganicDog("Finn", "dog", 90, "organic", 45, 14);
        RoboCat rc1 = new RoboCat("Tommy", "cat", 58, "robot", 45, 12);

        VirtualPetShelter vs = new VirtualPetShelter();

        while (status) {

            System.out.println("Enter 1 to admit the pet".toUpperCase());
            System.out.println("Enter 2 for adopting a pet".toUpperCase());
            System.out.println("enter 3 to check the status of pets admitted".toUpperCase());
            System.out.println("enter 4 to feed a organic pet or to charge a robot pet".toUpperCase());
            System.out.println("enter 5 to take take pet to walk".toUpperCase());
            System.out.println("enter 6 to feed individual pet ".toUpperCase());
            System.out.println("enter 7 to take robotic pet to maintainense check".toUpperCase());
            System.out.println("enter 8 to take individual pet to maintainence".toUpperCase());
            System.out.println("enter 9 to take individual pet to walk".toUpperCase());
            System.out.println("enter 10 to exit".toUpperCase());
            int userInput = input.nextInt();
            if(userInput == 1){
                System.out.println("select pet number you want to admit from list");
                System.out.println((" 1."+od1.petName.toString()+" is a "+" " +od1.petKind.toString()+" "+od1.petType.toString()).toUpperCase());
                System.out.println((" 2."+rd1.petName.toString()+" is a "+" " +rd1.petKind.toString()+" "+rd1.petType.toString()).toUpperCase());
                System.out.println((" 3."+oc1.petName.toString()+" is a "+" " +oc1.petKind.toString()+" "+oc1.petType.toString()).toUpperCase());
                System.out.println((" 4."+od2.petName.toString()+" is a "+" "+od2.petKind.toString()+" "+od2.petType.toString()).toUpperCase());
                System.out.println((" 5."+rc1.petName.toString()+" is a "+" " +rc1.petKind.toString()+" "+rc1.petType.toString()).toUpperCase());
                int petNumber = input.nextInt();
                if(petNumber == 1){
                    vs.admit(od1);
                    vs.listPrinter();
                }
                else if(petNumber == 2){
                    vs.admit(rd1);
                }
                else if(petNumber == 3){
                    vs.admit(oc1);
                }
                else  if(petNumber == 4){
                    vs.admit(od2);
                }
                else if(petNumber == 5){
                    vs.admit(rc1);
                }
            }
            else if(userInput == 2){
                vs.adopt();
            }
            else if(userInput == 3){
                vs.status();
                vs.listPrinter();
            }
            else if(userInput == 4){
                vs.feed();
                vs.listPrinter();
            }
            else if(userInput == 5){
                vs.walk();
                vs.listPrinter();
            }
            else if(userInput == 6){
                vs.feedInvidualPet();
                vs.listPrinter();
            }
            else if(userInput == 7){
                vs.maintainenceCheck();
                vs.listPrinter();
            }
            else if (userInput == 8){
                vs.maintainenceCheckIndividual();
                vs.listPrinter();
            }
            else  if (userInput == 9){
                vs.walkIndividualPetFromList();
                vs.listPrinter();
                input.nextLine();
            }
            else if (userInput == 10){
                break;
            }
            vs.tick();
        }
    }
}

