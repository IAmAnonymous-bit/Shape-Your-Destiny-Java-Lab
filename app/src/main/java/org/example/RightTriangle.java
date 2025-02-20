package org.example;
import java.lang.Math;

public class RightTriangle extends Shape implements Polygon
{
    private double length;
    private double width;

    public RightTriangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return (length * width) / 2;

    }

    @Override
    public double getPerimeter()
    {
        double a = (length * length) + (width * width);
        return length + width + Math.sqrt(a);

    }

    public int numberOfSides()
    {
        return 3;
    }

}