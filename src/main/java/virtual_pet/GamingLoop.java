package virtual_pet;

import java.util.Scanner;

public class GamingLoop {
    boolean status = true;
    boolean bored = false;
    public void gamingLoopActions(VertualPet vp){
        Scanner input = new Scanner(System.in);
        System.out.println("enter you want your dog to be 'feed' or 'walk'.");
        String action = input.nextLine();
        action.toLowerCase();
        switch (action){
            case "feed":
                System.out.println("enter how much quantity to be feed in number:");
                int foodQuantity = input.nextInt();
                input.nextLine();
                vp.feedFood(foodQuantity);
                break;
            case "walk":
                vp.walk();
                break;
        }
        vp.tick();
    }
}
