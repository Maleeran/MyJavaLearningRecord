package src.day15_Polymorphism.Practice.Practice2;

public class Dog extends Animal{
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating bones...");
    }

    public void bark(){
        System.out.println(name + " is barking: “Woof Woof!”");
    }
}
