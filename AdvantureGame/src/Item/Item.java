package Item;

public class Item {
    int id;
    String itemName;
    int price = 0;

    public Item(int id, String itemName , int price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    public String getName() {
        return this.itemName;
    }

    public void setName(String rname) {
        if (rname == this.itemName) {
            System.out.println("It cannot be the same as the previous name..");
        } else {
            this.itemName = rname;
        }

    }
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        if (price < 0 || price > 100) {
            System.out.println("Inavalid price");
        } else {
            this.price = price;
        }
    }

}

