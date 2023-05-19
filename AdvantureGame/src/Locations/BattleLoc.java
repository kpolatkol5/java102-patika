package Locations;

import Players.Monster;
import Item.Item;
import Players.SuperHero;

public abstract class BattleLoc extends  Location{
    Item item;
    Monster monsterName;


    public BattleLoc(String name, SuperHero player, Item item, Monster monsterName) {
        super(name, player);
        this.item = item;
        this.monsterName = monsterName;
    }

    public abstract void lookAround();

    public Monster getMonster() {
        return monsterName;
    }

    public void setMonsterName(Monster monsterName) {
        this.monsterName = monsterName;
    }

    public Item getItem() {
        return this.item;
    }

    public int randomMonster() {
        int result = (int) (Math.random() * 2);
        System.out.println(result);
        return result + 1;
    }

    public boolean war(SuperHero hero, int numberOfMonster) {

        for (int i = 0; i <= numberOfMonster; i++) {
            if (this.getMonster().getHealth() <= 0 && hero.getHealth() > 0) {

                System.out.println("Congratulations, you killed one of the monsters ");
                hero.setMoney(hero.getMoney()+this.getMonster().getMoney());
                this.getMonster().setHealth(10);
            }
            if (hero.getHealth() <= 0) {
                break;
            } else {
                while (true) {
                    if (hero.getHealth() <= 0 || this.getMonster().getHealth() <= 0) {
                        break;
                    } else {
                        int weaponDamage = hero.getGun() == null ? 0 : hero.getGun().getDamage();
                        int armorBlocking = hero.getArmor() == null ? 0 : hero.getArmor().getPrevention();

                        hero.shoot(this.getMonster(), weaponDamage);
                        this.getMonster().shoot(hero, armorBlocking);
                    }
                }
            }
        }
        return hero.getHealth() >= 0;

    }


}
