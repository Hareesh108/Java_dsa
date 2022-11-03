package Abstraction;


// Java program to illustrate the
// concept of Abstraction
abstract class Shape {
    String color;

    // these are abstract methods
     abstract double area();
    public abstract String Find();

    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() { return color; }
}
class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String Find()
    {
        return "Rectangle color is " + super.getColor()
                + " and area is : " + area();
    }
}

class Test1 {
    public static void main(String[] args)
    {
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s2.Find());
    }
}