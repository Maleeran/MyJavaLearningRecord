package src.day15_Polymorphism.Practice.Practice3;

public class Circle extends Shape{
    protected String name;
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
