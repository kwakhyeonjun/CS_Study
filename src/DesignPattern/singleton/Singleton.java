package DesignPattern.singleton;

public class Singleton {

    private Singleton() {}

    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}
