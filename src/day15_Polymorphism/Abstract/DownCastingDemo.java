package src.day15_Polymorphism.Abstract;

public class DownCastingDemo {
    public static void main(String[] args) {

        // 向下转型
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(5,6);

        System.out.println("第一个shape" + shape1.getArea());
        System.out.println("第二个shape" + shape2.getArea());
    }
}
