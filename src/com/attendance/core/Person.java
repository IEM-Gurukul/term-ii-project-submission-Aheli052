package com.attendance.core;

// This is the main template for everyone in the system.
// I made it abstract so we can't create a 'Person' without a role.
public abstract class Person {
    
    private String idNumber;
    private String name;

    // Constructor to set the basics for Students and Teachers
    public Person(String idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    // Getters to access private data
    public String getIdNumber() { 
        return idNumber; 
    }

    public String getName() { 
        return name; 
    }

    // Every person will have a different dashboard view
    public abstract void showDashboard();
}
