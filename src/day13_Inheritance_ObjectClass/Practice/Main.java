package src.day13_Inheritance_ObjectClass.Practice;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle("Circle1", 5)
                , new Rectangle("Rectangle1", 4, 6)
                , new Circle("Circle2", 7)
                , new Rectangle("Rectangle2", 4, 8)};

        for (Shape shape : shapes) {
            System.out.println(shape.name + ": " + shape.getArea());
        }
    }
}
