
package com.mycompany.prac05exer04;

class Rectangle extends Shape {
    private double length;
    private double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculateArea() {
        return length * width;
    }
}
