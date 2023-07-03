package entities;

public class Food {
    private final int id;
    private String name;
    private float price;

    public Food(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return name + " - $" + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
