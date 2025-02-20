package org.example;

public class App 
{
  public static void main(String[] args) 
  {
    Rectangle r = new Rectangle(3.0, 5.0);
    System.out.println("Rectangle area: " + r.getArea());
    System.out.println("Rectangle perimeter: " + r.getPerimeter());
    System.out.println("Number of sides on a rectangle: " + r.numberOfSides() + "\n");

    Square s = new Square(3.0);
    System.out.println("Square area: " + s.getArea());
    System.out.println("Square perimeter: " + s.getPerimeter());
    System.out.println("Number of sides on a square: " + s.numberOfSides() + "\n");

    Circle c = new Circle(3.0);
    System.out.println("Circle area: " + c.getArea());
    System.out.println("Circle perimeter: " + c.getPerimeter() + "\n");

    RightTriangle rt = new RightTriangle(3.0, 5.0);
    System.out.println("Right triangle area: " + rt.getArea());
    System.out.println("Right triangle perimeter: " + rt.getPerimeter());
    System.out.println("Number of sides on a right triangle: " + rt.numberOfSides() + "\n");

    IsoRightTriangle irt = new IsoRightTriangle(3.0);
    System.out.println("Isoceles right triangle area: " + irt.getArea());
    System.out.println("Isoceles right triangle perimeter: " + irt.getPerimeter());
    System.out.println("Number of sides on an isoceles right triangle: " + irt.numberOfSides());

  }

}
