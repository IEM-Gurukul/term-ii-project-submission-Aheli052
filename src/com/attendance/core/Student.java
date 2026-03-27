package com.attendance.core;

// Student class that takes features from Person
public class Student extends Person {
    
    private String roll; // Keeping it simple
    private double attendance; 

    // Constructor - I used 'super' to send name and ID to the Person class
    public Student(String idNumber, String name, String roll) {
        super(idNumber, name);
        this.roll = roll;
        this.attendance = 0.0; // Everyone starts at 0%
    }

    // This shows the student details on screen
    @Override
    public void showDashboard() {
        System.out.println("--- Student Dashboard ---");
        System.out.println("Name: " + getName());
        System.out.println("Roll: " + roll);
        System.out.println("Attendance: " + attendance + "%");
    }
}
