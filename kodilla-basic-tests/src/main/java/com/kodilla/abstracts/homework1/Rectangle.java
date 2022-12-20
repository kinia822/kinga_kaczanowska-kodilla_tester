package com.kodilla.abstracts.homework1;

public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void Area() {
        double area = a * b;
        System.out.println("Rectangle area equals: " + area);

    }

    @Override
    public void Perimeter() {
        double perimeter = 2 * (a + b);
        System.out.println("Rectangle perimeter equals: " + perimeter);
    }
}


