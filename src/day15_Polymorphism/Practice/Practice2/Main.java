package src.day15_Polymorphism.Practice.Practice2;

public class Main {
    public static void main(String[] args) {
        // 向上转型
        Animal a = new Dog("Labrador");
        a.eat();

        // 向下转型
        if(a instanceof Dog);
            Dog d = (Dog) a;
            d.bark();
    }
}

