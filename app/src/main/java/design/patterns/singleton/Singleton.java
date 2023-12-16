package design.patterns.singleton;

public class Singleton {

    private static Singleton instance;

    // prevent instantiation
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
