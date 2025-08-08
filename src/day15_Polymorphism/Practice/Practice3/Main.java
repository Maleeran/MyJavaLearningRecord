package src.day15_Polymorphism.Practice.Practice3;

import src.day15_Polymorphism.Practice.Practice2.Dog;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Circle1", 5);
        shapes[1] = new Rectangle("Rectangle2", 4, 6);
        shapes[2] = new Circle("Circle3", 7);

        for (Shape shape : shapes) {
            System.out.println(shape.name + ": " + shape.getArea());
        }
    }
}
