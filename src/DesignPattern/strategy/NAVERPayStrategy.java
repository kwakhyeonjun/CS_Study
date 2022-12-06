package DesignPattern.strategy;

public class NAVERPayStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public NAVERPayStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "paid using NAVER Pay");
    }
}
