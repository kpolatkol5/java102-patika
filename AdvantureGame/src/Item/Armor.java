package Item;

public class Armor extends Item {
    int prevention;


    public Armor(int id, String name, int prevention, int price) {
        super(id, name, price);
        this.prevention = prevention;

    }

    public int getPrevention() {
        return this.prevention;
    }

    public void setDamage(int prevention) {
        if (prevention < 0 || prevention > 100) {
            System.out.println("blocking information is invalid");
        } else {
            this.prevention = prevention;
        }
    }
}
