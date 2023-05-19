package Item;

public class Weapon extends Item {
    private int damage;

    public Weapon(int id, String itemName, int price, int damage) {
        super(id, itemName, price);
        this.damage = damage;
    }


    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        if (damage < 0 || damage > 100) {
            System.out.println("The damage information is invalid..");
        } else {
            this.damage = damage;
        }
    }
}
