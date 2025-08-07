package src.day14_AbstractandInterface;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("The sounds of " + name + " is 'Tweet Tweet'.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }

}
