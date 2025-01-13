package org.example;

public class GeometricCalculator {
    public static void main(String[] args) {
        GeometricFigure circle = new Circle(5.0, "Blue", "Red");
        GeometricFigure triangle = new Triangle(4.5, 4.0, 3.0,
                "Black", "Yellow");
        GeometricFigure rectangle = new Rectangle(10.0, 8.0, "Green", "Orange");

        System.out.println("Информация о круге: ");
        circle.printInfo();
        System.out.println();
        System.out.println("Информация о тругольнике: ");
        triangle.printInfo();
        System.out.println();
        System.out.println("Информация о прямоугольнике: ");
        rectangle.printInfo();
    }
}
