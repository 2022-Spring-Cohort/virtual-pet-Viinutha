package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args){
        String hungerSatisfaction = "";
        Scanner input = new Scanner(System.in);
        System.out.println("enter your pet name : ");
        String petName = input.nextLine();
        System.out.println("enter what kind of animal you have :");
        String species = input.nextLine();
        System.out.println("enter you pet breed");
        String breed = input.nextLine();
        System.out.println("enter your pet hunger level between 1 to 100: ");
        int hungerLevel = input.nextInt();
        System.out.println("enter your pet thirst level from 1 to 100 :");
        int thirsty = input.nextInt();
        input.nextLine();
        VertualPet dog = new VertualPet(petName,species,breed,hungerLevel,thirsty);
        //int hungerLevel = dog.tick(dog.getIsHungry());

        boolean status = true;
        boolean bored = false;
            while (status) {
                System.out.println("My name is " + dog.getPetName() + "\nand I am animal type " + dog.getPetType() +"\nmy breed is :"+dog.getBreed()+
                        "\nand hunger satisfaction is : "+dog.getHungry()+" "+ dog.hungerStatus(dog.getHungry()) +
                        "\nmy thirst level is: " + dog.getThirsty());
                System.out.println("enter you want your dog to be 'feed' or give 'liquids' or take for 'walk' or 'stop' to end");
                String action = input.nextLine();
                action.toLowerCase();
                switch (action){
                    case "feed":
                        System.out.println("enter how much quantity to be feed in number");
                        int foodQuantity = input.nextInt();
                        dog.feedFood(foodQuantity);
                        break;
                    case "liquids":
                        System.out.println("enter the quantity to be given to drink in number");
                        int liquidQuantity = input.nextInt();
                        dog.feedLiquid(liquidQuantity);
                        break;
                    case "walk":
                        System.out.println("please take your dog to walk :");
                        dog.walk();
                        break;
                    case "stop":
                        System.out.println(" stop application");
                        status = !status;
                        break;
                }
                if((int)Math.random()*100 == 5){
                    // bored = !bored;
                    System.out.println("your dog is bored: ");
                    bored = !bored;
                }
                dog.tick();

            }
    }
}
