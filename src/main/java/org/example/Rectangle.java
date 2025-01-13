package org.example;

public class Rectangle implements GeometricFigure {
    private final double side1;
    private final double side2;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double side1, double side2, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateSquare() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
