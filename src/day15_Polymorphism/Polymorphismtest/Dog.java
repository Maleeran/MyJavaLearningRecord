package src.day15_Polymorphism.Polymorphismtest;

public class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog is barking: Woof! Woof!");
    }

    public void fetch(){
        System.out.println("Dog is fetching the ball!");
    }
}
