package com.attendance.core;

// This class is for the teachers/staff
public class Teacher extends Person {
    
    private String dept; // Shortened from department to look more natural

    // Constructor to set name and department
    public Teacher(String id, String name, String dept) {
        super(id, name); // Sending the common info to Person class
        this.dept = dept;
    }

    // This part shows the teacher's view
    @Override
    public void showDashboard() {
        System.out.println("--- Staff View ---");
        System.out.println("Teacher: " + getName());
        System.out.println("Department: " + dept);
    }
}
