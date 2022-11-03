package Polymorphisom;

public class Main {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.draw();
        Shape obj1 = new Circle();
        obj1.draw();
        Shape obj2 = new Triangle();
        obj2.draw();
        Shape obj3 = new Rectangle();
        obj3.draw();
    }
}
