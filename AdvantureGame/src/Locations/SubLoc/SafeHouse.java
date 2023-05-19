package Locations.SubLoc;

import Locations.BattleLoc;
import Locations.NormalLoc;
import Players.SuperHero;
import Players.Monster;

import Item.Item;


import java.util.Scanner;

public class SafeHouse extends NormalLoc {

    private final Scanner input = new Scanner(System.in);
    private final ToolStore Store = new ToolStore("Store", this.player);
    private final Cave cave = new Cave("Cave", this.player, new Item(1, "Food", 0), new Monster(1, 3, 10, 4, "Zombie"));
    private final Forest forest = new Forest("Forest", this.player, new Item(2, "Wood", 0), new Monster(2, 4, 10, 7, "Vampire"));
    private final River river = new River("River", this.player, new Item(3, "Water", 0), new Monster(3, 7, 20, 12, "Bear"));


    public SafeHouse(String name, SuperHero player) {
        super(name, player);

    }

    public void healtReload() {
        if (this.player.getName().equals("samurai")) {
            this.player.setHealth(21);
            System.out.println("samurai health has been restored : " + this.player.getHealth());

        } else if (this.player.getName().equals("archer")) {
            this.player.setHealth(18);
            System.out.println("archer health has been restored: " + this.player.getHealth());

        } else {
            this.player.setHealth(24);
            System.out.println("knight health has been restored : " + this.player.getHealth());

        }

    }

    public void Welcome() {

        if (this.isLose(this.player)) {
            System.out.println("You lost the game...:/");
        } else if (this.player.getFood() != null && this.player.getWood() != null && this.player.getWater() != null) {
            System.out.println("Congratulations, you have won the game..:))");

        } else {
            System.out.printf("Welcome **<3 %s <3** .Here your health is restored and you can access the store..:D", this.player.getName());
            this.healtReload();

            this.Store.askEnterStore();

            System.out.println(this.player.getGun() == null);
            System.out.println(this.player.getArmor() == null);

            System.out.println("Let's Fight...");
            this.goToWar();
        }

    }

    public void hasAwardReceived(SuperHero player) {

        if (player.getFood() == null) {
            System.out.println("**** \n1- CAVE \n****");
        }
        if (player.getWood() == null) {
            System.out.println("**** \n2- FOREST \n****");
        }
        if (player.getWater() == null) {
            System.out.println("**** \n3- RIVER \n****");

        }
    }


    public void goToWar() {

        do {
            System.out.println("Where do you want to attack. Dial '0' to exit");


            this.hasAwardReceived(player);

            System.out.print("chocies : ");

            int chocies = input.nextInt();

            if (chocies == 0) {
                break;
            } else {
                System.out.println("The War Begins");
                if (chocies == 1) {
                    System.out.println("You're going to the cave");
                    this.onLocation(cave);
                    input.nextLine();
                    this.Welcome();

                } else if (chocies == 2) {
                    System.out.println("You're going to the forest");
                    this.onLocation(forest);
                    input.nextLine();
                    this.Welcome();

                } else if (chocies == 3) {
                    System.out.println("You're going to the river");
                    this.onLocation(river);
                    input.nextLine();
                    this.Welcome();
                }
                break;
            }

        } while (true);


    }


    public boolean isLose(SuperHero player) {
        return player.getHealth() <= 0;
    }

    @Override
    public void onLocation(BattleLoc goToLocation) {
        goToLocation.lookAround();
    }

}
