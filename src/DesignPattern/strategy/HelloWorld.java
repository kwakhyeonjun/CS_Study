package DesignPattern.strategy;

public class HelloWorld {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("A", 100);
        Item B = new Item("B", 100);

        cart.addItem(A);
        cart.addItem(B);

        // 네이버 페이로 결제하는 경우
        cart.pay(new NAVERPayStrategy("kwak0568@naver.com", "password"));

        // 카카오 카드로 결제하느 ㄴ경우
        cart.pay(new KAKAOCardStrategy("Hyenjun", "1234", "123", "12/01"));
    }
}
