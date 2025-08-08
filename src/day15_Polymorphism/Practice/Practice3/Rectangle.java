package src.day15_Polymorphism.Practice.Practice3;

public class Rectangle extends Shape{
    protected String name;
    protected double length;
    protected double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
