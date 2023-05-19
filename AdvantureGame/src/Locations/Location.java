package Locations;

import Players.SuperHero;

import java.util.Scanner;

public abstract class Location {
    private String name;
    public SuperHero player;
    public final Scanner input = new Scanner(System.in);

    public Location(String name, SuperHero player) {

        this.name = name;
        this.player = player;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void onLocation(BattleLoc goToLocation);



}
