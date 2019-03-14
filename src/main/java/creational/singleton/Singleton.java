package creational.singleton;

public class Singleton {

    // private static instance already defined
    private static volatile Singleton instance = null; // Lazily loaded concept: Object is only created if called

    // private constructor so a new instance cannot be created
    private Singleton() {
        if (instance != null){
            throw new RuntimeException("Use getInstance() to create Singleton");
        }
    }

    // convention getInstance() for Singletons
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}