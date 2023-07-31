
package com.mycompany.prac05exer04;

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
