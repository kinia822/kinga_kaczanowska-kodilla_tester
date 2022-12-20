package com.kodilla.abstracts.homework1;

public class Circle extends Shape {

    double r;
    final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void Area() {
        double area = PI * r * r;
        System.out.println("Circle area equals: " + area);
    }

    @Override
    public void Perimeter() {
        double perimeter = 2 * PI * r;
        System.out.println("Circle perimeter equals: " + perimeter);
    }
}
