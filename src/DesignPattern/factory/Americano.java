package DesignPattern.factory;

public class Americano extends Coffee {

    private final int price;
    public Americano(int price) {
        this.price = price;
    }

    @Override
    public CoffeeMenu getName() {
        return CoffeeMenu.Americano;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
