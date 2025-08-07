package src.day14_AbstractandInterface;

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Labrador");
        Bird bird = new Bird("Sparrow");

        dog.makeSound();
        dog.eat();

        bird.makeSound();
        bird.fly();
    }
}
