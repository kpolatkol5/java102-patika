package Locations.SubLoc;

import Locations.BattleLoc;
import Players.Monster;
import Players.SuperHero;
import Item.Item;


public class Cave extends BattleLoc {

    public Cave(String name, SuperHero player, Item item, Monster monsterName) {
        super(name, player, item, monsterName);
    }


    @Override
    public void lookAround() {
        int numberOfMonster = this.randomMonster();
        System.out.printf("There are %d %s here.Fight or flee(Y/n)..", numberOfMonster, this.getMonster().getName());
        System.out.print("choice    : ");

        String choice = this.input.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("war");
            if (this.war(this.player, numberOfMonster)) {
                this.player.setFood(this.getItem());
            }
        } else {
            System.out.println("Run Away");
        }
    }

    @Override
    public void onLocation(BattleLoc goToLocation) {
        this.lookAround();
    }
}
