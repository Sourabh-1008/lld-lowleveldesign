package org.sourabh.creational.singleton;
// Test Singleton Implementations
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("====== Testing Eager Initialization =====");
        // SingletonObject obj = new SingletonObject(); --> Compilation error
        // Get the unique instance of SingletonObject
        DBConnectionEager eager1 = DBConnectionEager.getInstance();
        DBConnectionEager eager2 = DBConnectionEager.getInstance();
        // Display the message
        eager1.displayMessage();
        eager2.displayMessage();
        // Check if the instances are the sane
        System.out.println("Same instance? " + (eager1 == eager2)); // true

        System.out.println("====== Testing Lazy Initialization =====");
        // Get the unique instance of SingletonObject
        DBConnectionLazy lazy1 = DBConnectionLazy.getInstance();
        DBConnectionLazy lazy2 = DBConnectionLazy.getInstance();
        // Display the message
        lazy1.displayMessage();
        lazy2.displayMessage();
        // Check if the instances are the same
        System.out.println("Same instance? " + (lazy1 == lazy2)); // true

        System.out.println("====== Testing Thread Safe Initialization =====");
        // Get the unique instances of Singleton
        DBConnectionThreadSafe threadSafe1 = DBConnectionThreadSafe.getInstance();
        DBConnectionThreadSafe threadSafe2 = DBConnectionThreadSafe.getInstance();
        // Display the message
        threadSafe1.displayMessage();
        threadSafe2.displayMessage();
        // Check if the instance are the same
        System.out.println("Same instance? " + (threadSafe1 == threadSafe2)); // true

        System.out.println("====== Testing Double Locking Initialization =====");
        DBConnectionDoubleLocking dbConnectionDoubleLocking1 = DBConnectionDoubleLocking.getInstance();
        DBConnectionDoubleLocking dbConnectionDoubleLocking2 = DBConnectionDoubleLocking.getInstance();
        // Display Message
        dbConnectionDoubleLocking1.displayMessage();
        dbConnectionDoubleLocking2.displayMessage();
        // Check if the instance are the same
        System.out.println("Same instance? " + (dbConnectionDoubleLocking1 == dbConnectionDoubleLocking2)); // true

    }
}
