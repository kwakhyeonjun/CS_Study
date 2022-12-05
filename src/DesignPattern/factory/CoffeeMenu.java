package DesignPattern.factory;

import java.util.Arrays;

public enum CoffeeMenu {
    Latte("Latte", 4000),
    Americano("Americano", 3000),
    DefaultCoffee("Default", -1);

    private final String type;

    CoffeeMenu(String type, int price) {
        this.type = type;
    }

    public static CoffeeMenu findByType(String type) {
        return Arrays.stream(CoffeeMenu.values())
                .filter(menu -> menu.type.equals(type))
                .findAny()
                .orElseThrow(() -> new RuntimeException("존재하지 않는 메뉴입니다."));
    }
}
