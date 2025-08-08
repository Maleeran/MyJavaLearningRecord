package src.day15_Polymorphism.Abstract;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
