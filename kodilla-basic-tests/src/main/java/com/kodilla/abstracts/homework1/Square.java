package com.kodilla.abstracts.homework1;

public class Square extends Shape {

    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void Area() {
        double area = a * a;
        System.out.println("Square area equals: " + area);
    }

    @Override
    public void Perimeter() {
        double perimeter = 4 * a;
        System.out.println("Square perimeter equals: " + perimeter);
    }
}
