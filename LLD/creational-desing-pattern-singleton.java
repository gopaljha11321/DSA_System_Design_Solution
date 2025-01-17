// Singleton Design Pattern
// Singleton design pattern is used when we want to ensure that a class has only one instance and provide a global point of access to it.

//4 Ways to implement Singleton Design Pattern
//1. Eager Initialization
//2. Lazy Initialization
//3. Thread Safe Singleton
//4. Double Checked Locking

//1. Eager Initialization
// Drawback: Consumes resources even if the instance is never used, leading to inefficiency.
class Main {
    private static Main instance = new Main(); // Instance created eagerly

    private Main() {
        // Private constructor to prevent instantiation
    }

    public static Main getInstance() {
        return instance; // Returns the single instance
    }
}

//2. Lazy Initialization
//not thread safe
class Main {
    private static Main instance;

    private Main() {
        // Private constructor to prevent instantiation
    }

    public static Main getInstance() {
        if (instance == null) {
            instance = new Main(); // Instance created only when needed
        }
        return instance; // Returns the single instance
    }
}

//3. Thread Safe Singleton or synchronized method
//thread safe but performance is low more costly
class Main {
    private static Main instance;

    private Main() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Main getInstance() {
        if (instance == null) {
            instance = new Main(); // Instance created only when needed
        }
        return instance; // Returns the single instance
    }
}

//4. Double Checked Locking
//widely used in production
class Main {
    private static Main instance;

    private Main() {
        // Private constructor to prevent instantiation
    }

    public static Main getInstance() {
        if (instance == null) {
            synchronized (Main.class) { // Locking to ensure thread safety
                if (instance == null) {
                    instance = new Main(); // Instance created only when needed
                }
            }
        }
        return instance; // Returns the single instance
    }
}