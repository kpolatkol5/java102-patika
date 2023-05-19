package Players;

public class Players {
    int Id;
    int damage;
    int health;
    int money;
    String name;


    public Players(int id, int damage, int health, int money, String name) {
        Id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shoot(Monster hero , int gunDamage) {
        hero.setHealth(hero.getHealth() - (this.getDamage()+gunDamage));
    }
    public void shoot(SuperHero hero , int armorPrevention) {
        hero.setHealth(hero.getHealth() - (this.getDamage() - armorPrevention));
    }
}
