package org.sourabh.creational.singleton;

public class DBConnectionDoubleLocking {

    // Double Locking Singleton instance variable
    private static DBConnectionDoubleLocking instance = null;

    // Private constructor
    private DBConnectionDoubleLocking(){};

    // Thread safe method to run the unique instance of the class
    public static synchronized DBConnectionDoubleLocking getInstance(){
        if(instance == null){
            synchronized (DBConnectionThreadSafe.class){
                if( instance == null){
                    instance = new DBConnectionDoubleLocking();
                }
            }
        }
        return instance;
    }
    // Method to display the message
    public void displayMessage(){
        System.out.println("Double Locking Singleton - " + this);
    }
}
