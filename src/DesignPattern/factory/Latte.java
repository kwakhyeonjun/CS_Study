package DesignPattern.factory;

public class Latte extends Coffee {

    private final int price;

    public Latte(int price) {
        this.price = price;
    }

    @Override
    public CoffeeMenu getName() {
        return CoffeeMenu.Latte;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
