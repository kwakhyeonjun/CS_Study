package DesignPattern.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeFactory {

    public static final Map<CoffeeMenu, Coffee> coffeeMap = new HashMap<>();

    public CoffeeFactory(List<Coffee> coffeeList) {
        for(Coffee coffee : coffeeList) {
            coffeeMap.put(coffee.getName(), coffee);
        }
    }
    public static Coffee getCoffee(String type, int price) {
        return coffeeMap.get(CoffeeMenu.findByType(type));
    }
}
