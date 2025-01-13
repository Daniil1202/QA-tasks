package org.example;

public interface GeometricFigure {
    double calculateSquare();

    double calculatePerimeter();

    String getFillColor();

    String getBorderColor();

    default void printInfo() {
        System.out.println("Площадь: " + calculateSquare());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());

    }


}
