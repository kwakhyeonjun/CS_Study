package DesignPattern.factory;

abstract class Coffee {
    public abstract int getPrice();

    public abstract CoffeeMenu getName();

    @Override
    public String toString() {
        return "Hi this coffee is " + this.getPrice();
    }
}
