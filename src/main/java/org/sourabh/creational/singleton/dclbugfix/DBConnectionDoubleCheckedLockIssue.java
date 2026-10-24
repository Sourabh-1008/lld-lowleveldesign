package org.sourabh.creational.singleton.dclbugfix;

import org.sourabh.creational.singleton.DBConnectionDoubleLocking;

// Single - Double Checked Locking - Issue Demo
public class DBConnectionDoubleCheckedLockIssue {

    // Double Locking Singleton connectionObj variable
    private static DBConnectionDoubleCheckedLockIssue connectionObj = null;
    int portNumber;

    // Private Constructor
    private DBConnectionDoubleCheckedLockIssue(int portNumber) {
        this.portNumber = portNumber;
    };

    // Thread Safe Method to return the unique connectionObj of this class
    public static synchronized DBConnectionDoubleCheckedLockIssue getConnectionObj(){
        if( connectionObj == null) { // First Check
            synchronized (DBConnectionDoubleCheckedLockIssue.class){
                if (connectionObj == null){ // Second Check
                    connectionObj = new DBConnectionDoubleCheckedLockIssue(5567);
                }
            }
        }
        return connectionObj;
    }

    // Method to display the Message
    public void displayMessage(){
        System.out.println("Singleton - Double Checked Locking - Issues " + this);
    }
}
