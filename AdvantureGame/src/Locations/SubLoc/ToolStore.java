package Locations.SubLoc;

import Item.Armor;
import Item.Weapon;
import Item.Item;

import Locations.BattleLoc;
import Locations.NormalLoc;
import Players.SuperHero;

import java.util.Scanner;

public class ToolStore extends NormalLoc {
    public final Scanner input = new Scanner(System.in);

    public ToolStore(String name, SuperHero player) {
        super(name, player);
    }


    public void menu() {
        Weapon pistol = new Weapon(1, "Pistol", 25, 2);

        Weapon sword = new Weapon(2, "Sword", 35, 3);
        Weapon rifle = new Weapon(3, "Rifle", 45, 7);

        Armor lightArmor = new Armor(1, "Light Armor", 1, 15);
        Armor middleArmor = new Armor(2, "Middle Armor", 3, 25);
        Armor heavyArmor = new Armor(3, "Heavy Armor", 5, 40);

        String weaponStr = String.format("""
                        Weapon
                             1-  Weapon Name : %s Weapon blocking : %d  weapon price: %d $ \n
                             2-  Weapon Name : %s Weapon blocking : %d  weapon price: %d $ \n
                             3-  Weapon Name : %s Weapon blocking : %d  weapon price: %d $ \n                                               
                         """, pistol.getName(), pistol.getDamage(), pistol.getPrice(),

                sword.getName(), sword.getDamage(), sword.getPrice(),

                rifle.getName(), rifle.getDamage(), rifle.getPrice()

        );
        String armorStr = String.format("""
                Armors
                    1-  Armor Name : %s armor blocking : %d  Armor price: %d $ \n
                    2-  Armor Name : %s armor blocking  : %d  Armor price: %d $ \n
                    3-  Armor Name : %s armor blocking  : %d  Armor price: %d $  \n
                                        
                """, lightArmor.getName(), lightArmor.getPrevention(), lightArmor.getPrice(), middleArmor.getName(), middleArmor.getPrevention(), middleArmor.getPrice(), heavyArmor.getName(), heavyArmor.getPrevention(), heavyArmor.getPrice()

        );

        String welcomeStr = String.format("**************\n Welcome %s \nDial '0' to exit the store\n '1'-To buy a gun\n '2' -To buy a armor\n**************", this.player.getName());
        while (true) {
            System.out.println(welcomeStr);
            System.out.println("The money in your account : " + this.player.getMoney() + "$");
            System.out.print("Chocies : ");
            int chocies = this.input.nextInt();


            if (chocies == 0) {
                System.out.println("Leaving the store..");
                break;
            } else if (chocies == 1) {
                System.out.println("The money in your account: " + this.player.getMoney());
                System.out.println(weaponStr);

                System.out.print("chocies :");
                int selectedWeapon = this.input.nextInt();


                while (true) {
                    int oldBalance = this.player.getMoney();

                    if (selectedWeapon == 1) {
                        this.buyItem(this.player, pistol);

                        if (oldBalance != this.player.getMoney()) {
                            this.player.setGun(pistol);

                        }
                        break;


                    } else if (selectedWeapon == 2) {
                        this.buyItem(this.player, sword);

                        if (oldBalance != this.player.getMoney()) {
                            this.player.setGun(sword);
                        }
                        break;

                    } else if (selectedWeapon == 3) {
                        this.buyItem(this.player, rifle);

                        if (oldBalance != this.player.getMoney()) {
                            this.player.setGun(rifle);
                        }
                        break;
                    } else {
                        System.out.println("The wrong options");

                        break;
                    }
                }


            } else if (chocies == 2) {
                System.out.println("Balance : " + this.player.getMoney());
                System.out.println(armorStr);


                System.out.print("chocies :");
                int selectedArmor = this.input.nextInt();


                do {
                    int oldBalance = this.player.getMoney();

                    if (selectedArmor == 1) {
                        this.buyItem(this.player, lightArmor);

                        if (oldBalance != this.player.getMoney()) {
                            this.player.setArmor(lightArmor);
                        }
                        break;


                    } else if (selectedArmor == 2) {
                        this.buyItem(this.player, middleArmor);

                        if (oldBalance != this.player.getMoney()) {
                            this.player.setArmor(middleArmor);
                        }
                        break;

                    } else if (selectedArmor == 3) {
                        this.buyItem(this.player, heavyArmor);
                        if (oldBalance != this.player.getMoney()) {
                            this.player.setArmor(heavyArmor);

                        }
                        break;
                    } else {
                        System.out.println("The wrong options");
                        break;
                    }
                } while (true);

            } else {
                System.out.println("Incorrect operation");
            }
        }


    }

    public boolean checkBalance(SuperHero player, Item item) {

        if (player.getMoney() < item.getPrice()) {
            return false;
        }
        return true;
    }

    public void buyItem(SuperHero player, Item item) {
        if (checkBalance(player, item)) {
            int result = player.getMoney() - item.getPrice();
            player.setMoney(result);
            System.out.println(item.getName() + "added to inventory..\n");
        } else {
            System.out.println("insufficient balance");
        }
    }



    @Override
    public  void onLocation(BattleLoc goToLocation){

    }


    public void  askEnterStore(){
        System.out.println("Would you like to enter the store?");

        System.out.print("Chocies(Y):  : ");
        String chocies = this.input.nextLine();

        if (chocies.equalsIgnoreCase("Y")) {
            this.menu();
        }
        input.nextLine();

    }

}


