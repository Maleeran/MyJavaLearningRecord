package src.day_17_Enumerations_Annotations.Practice.Practice2;

class Animal {
    public void makeSound() {
        System.out.println("Some animal is making some sounds. ");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }

    @Deprecated
    public void oldBark(){
        System.out.println("This method is deprecated.");
    }
}

public class Practice2test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.oldBark();
    }
}
