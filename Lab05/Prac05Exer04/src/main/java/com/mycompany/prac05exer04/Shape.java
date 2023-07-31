
package com.mycompany.prac05exer04;

public abstract class Shape {
    abstract double calculateArea();
    
    void display() {
        System.out.println("Area: " + calculateArea());
    }
}
