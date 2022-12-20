package com.kodilla.abstracts.homework1;

public class Application {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.Area();
        circle.Perimeter();

        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.Area();
        rectangle.Perimeter();

        Square square = new Square(2);
        square.Area();
        square.Perimeter();
    }
}
