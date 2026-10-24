package org.sourabh.creational.singleton;
// 3. Thread Safe Singleton
public class DBConnectionThreadSafe {

    // Singleton Object is created only when it is required
    private static DBConnectionThreadSafe instance = null;
    // Private Constructor to avoid client applications from using the constructor
    private DBConnectionThreadSafe(){}

    // Thread Safe Method to return the unique instances of this class
    public static synchronized DBConnectionThreadSafe getInstance(){
        if (instance == null){
            instance = new DBConnectionThreadSafe();
        }
        return instance;
    }

    // Method to display a message
    public void displayMessage(){
        System.out.println("Thread Safe Singleton - " + this);
    }
}
