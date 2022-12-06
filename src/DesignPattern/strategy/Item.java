package DesignPattern.strategy;

public class Item {
    private final String name;
    private final int price;

    public Item(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
