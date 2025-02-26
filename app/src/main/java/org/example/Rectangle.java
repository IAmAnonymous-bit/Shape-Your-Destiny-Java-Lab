package org.example;

public class Rectangle extends Shape implements Polygon
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
        
    }

    @Override
    public double getArea()
    {
        return length * width;

    }

    @Override
    public double getPerimeter()
    {
        return 2 * (length + width);

    }

    public int numberOfSides()
    {
        return 4;

    }

}