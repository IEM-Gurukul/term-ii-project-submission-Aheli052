package com.attendance;

import com.attendance.core.Student;
import com.attendance.core.Teacher;

// Testing the core package logic
public class AttendanceSystem {
    public static void main(String[] args) {
        
        System.out.println("--- Testing Attendance System ---");

        // Simple test for the student class
        Student s1 = new Student("S101", "Rahul Kumar", "2026/CSE/001");
        s1.showDashboard();

        System.out.println(); // Space for better output

        // Simple test for the teacher class
        Teacher t1 = new Teacher("T501", "Dr. Sharma", "Computer Science");
        t1.showDashboard();
    }
}
