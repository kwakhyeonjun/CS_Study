package DesignPattern.factory;

public class DefaultCoffee extends Coffee {
    private final int price;

    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public CoffeeMenu getName() {
        return CoffeeMenu.DefaultCoffee;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
