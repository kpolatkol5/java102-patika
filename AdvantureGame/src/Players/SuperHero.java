package Players;

import Item.Armor;
import Item.Weapon;
import Item.Item;

public class SuperHero extends Players{

    Weapon gun;
    Armor armor;

    Item water;
    Item food;
    Item wood;

    public SuperHero(int id, int damage, int health, int money, String name) {
        super(id, damage, health, money, name);

    }

    public Weapon getGun() {
        return gun;
    }

    public void setGun(Weapon gun) {
        this.gun = gun;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Item getWater() {
        return water;
    }

    public void setWater(Item water) {
        this.water = water;
    }

    public Item getFood() {
        return food;
    }

    public void setFood(Item food) {
        this.food = food;
    }

    public Item getWood() {
        return wood;
    }

    public void setWood(Item wood) {
        this.wood = wood;
    }
}
