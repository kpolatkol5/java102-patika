import Players.SuperHero;

import java.util.Scanner;
import Locations.SubLoc.SafeHouse;

public class Start {
    public SuperHero player;
    private final Scanner input = new Scanner(System.in);



    public void run() {
        System.out.println("Hello.Welcome Advanture Game");
        this.player = this.selectSuperHero();
        SafeHouse safeZone = new SafeHouse("Safe Zone", this.player);
        safeZone.Welcome();


    }

    public SuperHero selectSuperHero() {


        System.out.println("Which character do you want to play with?\n1-Samurai\n2-Archer\n3-Knight");
        System.out.print("Chocies: ");

        int selectHero = input.nextInt();

        if (selectHero == 1) {
            return new SuperHero(1, 5, 21, 15, "samurai");
        } else if (selectHero == 2) {
            return new SuperHero(2, 7, 18, 20, "archer");

        } else if (selectHero == 3) {
            return new SuperHero(3, 8, 24, 5, "knight");
        } else {
            System.out.println("Line selection The default character is defined");
        }
        return new SuperHero(1, 5, 21, 15, "samurai");
    }
}
